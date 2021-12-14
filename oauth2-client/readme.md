# 客户端
- 一定要先把项目的配置都看一遍
- 客户端的使用结合授权服务器看

## 启动DEMO
- 分别启动**auth-server**和**oauth2-client**两个项目。
- 调用 [http://127.0.0.1:8080/oauth2/authorization/{client}](http://127.0.0.1:8080/oauth2/authorization/ddd)
- 输入用户名`dd`和密码`dd`后即可返回OAuth2.0 Client的信息

## 注意
- **_ mac.dou.com、auth-server.com 需要自己配置host _**
- **_ client配置provider要与授权服务器配置的 http://auth-server.com 保持一致，即issuer-uri要一致 _**
