1.proxool的方法，参数类型不对，修改源代码参数类型为long
<!-- proxool public void setHouseKeepingSleepTime(int houseKeepingSleepTime) {
        this.houseKeepingSleepTime = houseKeepingSleepTime;
        } 方法不对，参数类型为long-->

2.proxool-cglib 下载后安装本地库org/logicalcobwebs/proxool/proxool-cglib文件夹下面
	改名字(比如0.9.1)，后面加上数字，表示版本，然后在pom.xml中就可以正常使用了。
<dependency>
	<groupId>org.logicalcobwebs.proxool</groupId>
	<artifactId>proxool-cglib</artifactId>
	<version>0.9.1</version>
</dependency>