// index.js
// Page({})

Page({
  onLoad() {
    this.checkLogin()
  },
  
  checkLogin() {
		const token = wx.getStorageSync('token')
    if (!token) {
      // 未登录，跳转到登录页
      wx.navigateTo({
        url: '/pages/login/login'
      })
      return false
    }
    return true
  }
})
