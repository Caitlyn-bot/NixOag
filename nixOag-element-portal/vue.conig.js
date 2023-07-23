module.exports = {
  devServer: {
    open: true,
    proxy: {
      '/api': { // 匹配所有以 '/dev-api'开头的请求路径
        target: 'http://localhost:8081/nixOag',
        changeOrigin: true, // 支持跨域
        pathRewrite: { // 重写路径: 去掉路径中开头的'/dev-api'
          '^/api': ''
        }
      }
    }
  }
}
