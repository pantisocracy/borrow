<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<html>
<jsp:include page="head.jsp"/>
<body>
<!-- grow -->
	<div class="grow">
		<div class="container">
			<h2>用户注册</h2>
		</div>
	</div>
	<!-- grow -->
<!--content-->
<div class=" container">
<div class=" register">
	
		  	  <form action="/web/index">
				 <div class="col-md-6 register-top-grid">
					<h3>请输入您的个人信息</h3>
					 <div>
						<span>姓名</span>
						<input type="text"> 
					 </div>
					 <div>
						<span>手机号</span>
						<input type="text"> 
					 </div>
					 <div>
						 <span>邮箱</span>
						 <input type="text"> 
					 </div>
					   <a class="news-letter" href="#">
						 <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>我已同意以上需求</label>
					   </a>
					 </div>
				     <div class="col-md-6 register-bottom-grid">
						    <h3>请输入你的账户信息</h3>
							 <div>
								<span>用户名</span>
								<input type="password">
							 </div>
							 <div>
								<span>密码</span>
								<input type="password">
							 </div>
						    <div>
							 <span>确认密码</span>
							 <input type="password">
						 </div>
							 <input type="submit" value="submit">
							
					 </div>
					 <div class="clearfix"> </div>
				</form>
			</div>
</div>
</body>
<jsp:include page="footer.jsp"/>
</html>
			