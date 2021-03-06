# Burpsuite JsScan 插件
burpsuite插件：主动和被动进行JS扫描
+ 目前实现了主动扫描和被动扫描
+ 主动扫描模块使用了珍藏字典
+ 被动扫描模块将会分析每一个经过burpsuite的请求，如果是js文件就会记录
+ 排除常见的JS库，只分析自定义JS，有效发现目标
+ 将扫描到的自定义JS文件自动添加到自带字典中，逐步完善字典
## 拓展
+ 具体可利用点的分析，例如ajax语法等（在github上发现了外国大佬用python写这个burp插件）
+ 关于解析JS，参考`https://github.com/Threezh1/JSFinder`的实现，基于一个大正则，外国大佬的工具也是基于这个大正则
+ 其实关于可利用点和隐藏接口等，手动分析最佳，插件帮你快速找出JS文件的URL即可
## 简单使用方式
- 主动扫描功能输入JS路径就可以开始（`https://www.xxx.com/static/js/`），相当于一个简化版的intruder
- 被动扫描勾选后就开始了，不用管它，正常使用Burp即可，会自动收集JS路径
### 开发者
- 小迪安全团队（许少，修君）

****
![1.png](https://xuyiqing-1257927651.cos.ap-beijing.myqcloud.com/burpsuite/js-1.jpg)
****
![2.png](https://xuyiqing-1257927651.cos.ap-beijing.myqcloud.com/burpsuite/js-2.jpg)
****

****
# Burpsuite Jsscan Plugin
Burpsuite plug-in: active and passive JS scanning and analysis of available points
+ At present, active scanning and passive scanning are realized
+ The active scanning module uses a collection dictionary
+ The passive scan module will analyze every request passing through burpsuite, and if it is JS file, it will be saved
****
## Follow Up Functions
+ Exclude all kinds of JS libraries, only analyze custom JS, effectively discover the target
+ The analysis of specific points can be used, such as Ajax syntax
+ Consider automatically adding the scanned custom JS file to the dictionary to improve the dictionary step by step
### Developer
- XiaoDi Team(Xu,XiuJun)
