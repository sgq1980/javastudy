本机访问路径：http://localhost:8080/sshmarket/goods/list.action
1.proxool的方法，参数类型不对，修改源代码参数类型为long
<!-- proxool public void setHouseKeepingSleepTime(int houseKeepingSleepTime) {
        this.houseKeepingSleepTime = houseKeepingSleepTime;
        } 方法不对，参数类型为long-->

2.proxool-cglib 安装本地库
	改名字，后面加上数字，表示版本，然后在pom.xml中就可以正常使用了。
	
3.You must specify a valid lifecycle phase or a goal in the format
 	解决办法 ：pom.xml文件<build>标签后面加上<defaultGoal>compile</defaultGoal>即可  
4.Error assembling WAR: webxml attribute is required (or pre-existing WEB-INF/web.xml if executing in update mode)
	解决方法:<configuration>
					<!-- 指定web.xml位置 -->
					<webXml>WebRoot\WEB-INF\web.xml</webXml>
				</configuration>
5.多个源目录配置,需要验证
	<resource>
			<!-- 指定resources目录也作为源目录？以后验证2013-3-15？ -->
				<directory>${basedir}/resources</directory>
			</resource>
6. org.hibernate.SessionFactory.openSession()Lorg/hibernate/classic/Session	
	解决方法：hibernate4 ,spring已经不再提供hibernateDaoSupport.getTemplate