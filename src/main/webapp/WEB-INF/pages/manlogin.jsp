<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<html>
<body>
<jsp:include page="head.jsp"/>
<!--header-->
	<!-- grow -->
	<div class="grow">
		<div class="container">
			<h2>登录</h2>
		</div>
	</div>
	<!-- grow -->
<!--content-->
<div class="container">
		<div class="account">
		<div class="account-pass">
		<div class="col-md-8 account-top">
			<form method="post" action="/web/manSubmit">

			<div>
				<span>用户名</span>
				<input type="text" name="userName">
			</div>
			<div>
				<span >密码</span>
				<input type="password" name="passWord">
			</div>
				<input type="submit" value="登录">&nbsp;&nbsp;&nbsp;<a href="/web/register"  style="width: 40px;">注册</a>
			</form>

		</div>
<%--		<div class="col-md-4 left-account ">
			<a href="single.jsp"><img class="img-responsive " src="/images/s1.jpg" alt=""></a>
			<a href="register.jsp" class="create">Create an account</a>
<div class="clearfix"> </div>
		</div>--%>
	<div class="clearfix"> </div>
	</div>
	</div>

</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
