1.proxool的方法，参数类型不对，修改源代码参数类型为long
<!-- proxool public void setHouseKeepingSleepTime(int houseKeepingSleepTime) {
        this.houseKeepingSleepTime = houseKeepingSleepTime;
        } 方法不对，参数类型为long-->

2.proxool-cglib 安装本地库
	改名字，后面加上数字，表示版本，然后在pom.xml中就可以正常使用了。
	
3.You must specify a valid lifecycle phase or a goal in the format
 	解决办法 ：pom.xml文件<build>标签后面加上<defaultGoal>compile</defaultGoal>即可  