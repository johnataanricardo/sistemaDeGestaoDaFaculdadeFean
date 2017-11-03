<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Faculdade Fean</title>
  <!-- Bootstrap core CSS-->
  <link href="<c:url value="/assets/vendor/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
  <!-- Custom fonts for this template-->
  <link href="<c:url value="/assets/vendor/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="<c:url value="/assets/css/sb-admin.css"/>" rel="stylesheet" type="text/css">
  <link href="<c:url value="/assets/css/login-page.css"/>" rel="stylesheet" type="text/css">
</head>

<body class="login-page">
<div class="container">
  <div class="card card-login mx-auto mt-5">
    <div class="card-header">Faculdade Fean</div>
    <div class="card-body">
      <form>
        <div class="form-group">
          <label style="text-align: left" for="user">Usuário</label>
          <input class="form-control" id="user" type="text" aria-describedby="emailHelp" placeholder="Usuário">
        </div>
        <div class="form-group">
          <label for="senha">Senha</label>
          <input class="form-control" id="senha" type="password" placeholder="Senha">
        </div>
        <a class="btn btn-primary btn-block" href="/SistemaFean/inicio">Login</a>
      </form>
    </div>
  </div>
</div>
<!-- Bootstrap core JavaScript-->
<script src="/assets/vendor/jquery/jquery.min.js"></script>
<script src="/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Core plugin JavaScript-->
<script src="/assets/vendor/jquery-easing/jquery.easing.min.js"></script>
</body>

</html>

