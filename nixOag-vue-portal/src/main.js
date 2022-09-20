
// Electron的主进程

//引入Electron
var electron = require('electron');
//引用app
var app = electron.app;
//窗口引用
var browserWindow = electron.BrowserWindow
//声明要打开的主窗口
var mainWindow = null

app.on('ready',() => {
    // 设置窗口大小
    mainWindow = new browserWindow({width:1200,height:800});
    //加载页面
    mainWindow.loadFile('App.vue');
    // 设置监听关闭窗口事件
    mainWindow.on('closed',() => {
        mainWindow = null;
    })
})