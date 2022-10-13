

const {
    app,
    BrowserWindow,
    screen,
    Tray,
    Menu,
    shell,
    dialog,
    nativeImage,
} = require('electron');
const path = require('path');
//声明要打开的主窗口
let mainWindow;
app.on('ready',() => {
    // 设置窗口大小
    mainWindow = new BrowserWindow({
        width: screen.getPrimaryDisplay().workAreaSize.width,
        height: screen.getPrimaryDisplay().workAreaSize.height,
        icon: path.resolve(__dirname, 'favicon_256.ico'),
        webPreferences: {
            nodeIntegration: true,
            preload: path.join(__dirname, 'preload.js'),
        },});
    //加载页面
    mainWindow.loadURL('http://localhost:8080/');
    // 设置监听关闭窗口事件
    mainWindow.on('closed',() => {
        mainWindow = null;
    })
})
