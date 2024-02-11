let cvs = document.querySelector(".cvs");

// 此处用类型保护将cvs确定为 HTMLCanvasElement 类型
if (cvs instanceof HTMLCanvasElement) {
    const ctx = cvs.getContext("2d")
    // 画布大小
    let width = 0;
    let height = 0;

    // 设置画布大小与窗口一样大
    const setSize = () => {
        // 获取当前文档内容区宽高
        width = document.documentElement.clientWidth;
        height = document.documentElement.clientHeight;
        // 类型保护只在上个作用域生效，所以这里再写一次
        if (cvs instanceof HTMLCanvasElement) {
            // 设置canvas的实际宽高
            cvs.width = width;
            cvs.height = height;
        }
    };
    window.onresize = setSize;
    setSize();

    // 小球数量
    const dotNum = 100  ;
    // 小球列表
    const dotList = [];
    // 随机数
    const random = (min, max) =>
        Math.floor(Math.random() * (max - min + 1) + min);
    // 随机生成 1 和 -1
    const randomSign = () => [-1, 1][random(0, 1)];

    for (let i = 0; i < dotNum; i++) {
        dotList.push({
            // 随机坐标(4 是圆半径)
            x: random(4, width - 4),
            y: random(4, height - 4),
            // 随机加速度（randomSign 用来让加速度有正反值，球就有不同的方向）
            xa: Math.random() * randomSign(),
            ya: Math.random() * randomSign(),
            // 圆点半径
            radius: 4
        });
    }

    // 鼠标坐标
    let point = {
        x: -1,
        y: -1
    };

    // 鼠标坐标实时获取
    window.addEventListener("mousemove", ({ clientX, clientY }) => {
        point = {
            x: clientX,
            y: clientY
        };
    });
    // 移出窗口坐标清除
    window.addEventListener("mouseout", () => {
        point = {
            x: -1,
            y: -1
        };
    });

    // 预设值距离值（平方值）
    const distSquare = 10000;
    // 将两个小球进行连线（参数：两点距离(平方值)、当前小球、下一个小球）
    const drawLine = (dist, dot, nextDot) => {
        // 距离差值 与 预设距离的比例计算透明度，距离越近越不透明
        let op = (distSquare - dist) / distSquare;
        // 计算线条宽度
        const lineWidth = op / 2;
        ctx.lineWidth = lineWidth;
        // 设置线条颜色和透明度
        ctx.strokeStyle = `rgba(20, 112, 204,${op + 0.2})`;
        // 画路径
        ctx.beginPath();
        ctx.moveTo(dot.x, dot.y);
        ctx.lineTo(nextDot.x, nextDot.y);
        // 画线
        ctx.stroke();
    };
    // 绘制函数
    const draw = () => {
        // 清空上次绘制
        ctx.clearRect(0, 0, width, height);

        dotList.forEach((dot, index) => {
            // 计算下一帧的坐标
            dot.x += dot.xa;
            dot.y += dot.ya;

            // 计算边界值
            const Xmin = dot.radius;
            const Xmax = width - dot.radius;
            const Ymin = dot.radius;
            const Ymax = height - dot.radius;

            // 判断下一帧坐标是否越界，越界则将加速度取反，小球就可以在边缘反弹。
            (dot.x >= Xmax || dot.x <= Xmin) && (dot.xa = -dot.xa);
            (dot.y >= Ymax || dot.y <= Ymin) && (dot.ya = -dot.ya);

            // 将越界坐标矫正
            dot.x = dot.x >= Xmax ? Xmax : dot.x <= Xmin ? Xmin : dot.x;
            dot.y = dot.y >= Ymax ? Ymax : dot.y <= Ymin ? Ymin : dot.y;

            // 小球之间连线
            for (let i = index + 1; i < dotList.length; i++) {
                // dot后面的小球
                let nextDot = dotList[i];
                // 计算两个小球的x 与 y 坐标差值
                let x_dist = dot.x - nextDot.x;
                let y_dist = dot.y - nextDot.y;
                // 利用三角函数计算斜线长度，也就是两小球距离
                let dist = x_dist * x_dist + y_dist * y_dist;
                // 两点距离小于预设值则让两点连线
                if (dist < distSquare) {
                    drawLine(dist, dot, nextDot);
                }
            }

            // 小球与鼠标之间连线(不为-1表示鼠标在里面)
            if (point.x !== -1) {
                // 计算鼠标与当前小球坐标差值
                let x_dist = point.x - dot.x;
                let y_dist = point.y - dot.y;
                // 计算鼠标与当前小球直线距离
                let dist = x_dist * x_dist + y_dist * y_dist;
                // 小于预设值（可以连线）
                if (dist < distSquare) {
                    // 大于等于 预设值的一半 小于预设值（范围是个外圆圈） 加速向鼠标
                    if (dist >= distSquare / 2) {
                        dot.x += 0.02 * x_dist;
                        dot.y += 0.02 * y_dist;
                    }
                    drawLine(dist, dot, point);
                }
            }

            // 设置小球的颜色
            ctx.fillStyle = "#6cf";
            // 画小球路径
            ctx.beginPath();
            ctx.arc(dot.x, dot.y, dot.radius, 0, Math.PI * 2);
            // 填充颜色
            ctx.fill();
        });
        requestAnimationFrame(draw);
    };

    // 动画开始
    draw();
}