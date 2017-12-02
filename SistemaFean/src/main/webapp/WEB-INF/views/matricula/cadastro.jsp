<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Faculdade Fean</title>
    <!-- Bootstrap core CSS-->
    <link href="<c:url value="/assets/vendor/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">
    <!-- Custom fonts for this template-->
    <link href="<c:url value="/assets/vendor/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
    <!-- Custom styles for this template-->
    <link href="<c:url value="/assets/css/sb-admin.css"/>" rel="stylesheet" type="text/css">

    <script src="<c:url value="/assets/vendor/jquery/jquery.min.js"/> "></script>

    <script type="text/javascript">

        $(function () {
            var curso = 0;
            curso = ${matricula.idCurso};

            console.log(curso);
            if (curso > 0) {
                $("#idCurso").val(curso);
            }
        });

    </script>


</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<!-- Navigation-->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
    <a class="navbar-brand" href="/SistemaFean/inicio">Faculdade FEAN</a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
            data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false"
            aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Início">
                <a class="nav-link" href="/SistemaFean/inicio">
                    <i class="fa fa-fw fa-dashboard"></i>
                    <span class="nav-link-text">Início</span>
                </a>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Cadastros">
                <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseExamplePages"
                   data-parent="#exampleAccordion">
                    <i class="fa fa-pencil"></i>
                    <span class="nav-link-text">Cadastros</span>
                </a>
                <ul class="sidenav-second-level collapse" id="collapseExamplePages">
                    <li>
                        <a class="nav-link" href="/SistemaFean/usuario/todos">
                            <i class="fa fa-user-circle"></i>
                            <span class="nav-link-text">Usuários</span>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="/SistemaFean/materia/todas">
                            <i class="fa fa-book"></i>
                            <span class="nav-link-text">Matérias</span>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="/SistemaFean/sala/todos">
                            <i class="fa fa-university"></i>
                            <span class="nav-link-text">Salas</span>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="/SistemaFean/curso/todos">
                            <i class="fa fa-university"></i>
                            <span class="nav-link-text">Cursos</span>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="/SistemaFean/matricula/todas">
                            <i class="fa fa-id-card"></i>
                            <span class="nav-link-text">Matrículas</span>
                        </a>
                    </li>
                </ul>
            </li>
        </ul>
        <ul class="navbar-nav sidenav-toggler">
            <li class="nav-item">
                <a class="nav-link text-center" id="sidenavToggler">
                    <i class="fa fa-fw fa-angle-left"></i>
                </a>
            </li>
        </ul>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" data-toggle="modal" data-target="#exampleModal">
                    <i class="fa fa-fw fa-sign-out"></i>Logout</a>
            </li>
        </ul>
    </div>
</nav>
<div class="content-wrapper">

    <div class="container-fluid">

        <ol class="breadcrumb">
            <li>Cadastros / Matrículas</li>
        </ol>

        <h1>Matrícula</h1>

        <div>
            <spring:url value="${ matricula.idMatriculaAluno == null ? '/matricula/save' : '/matricula/update' }" var="save" />
            <form:form modelAttribute="matricula" action="${save}" method="post">
                <form:hidden path="idMatriculaAluno" />
                <form:hidden path="idUsuario" />

                <div class="form-control">

                    <h4>Dados do Usuário do Aluno</h4>

                    <div class="form-group">
                        <label for="nome">Nome: </label>
                        <form:input path="nome" class="form-control" placeholder="Nome" />
                        <form:errors path="nome" cssClass="label label-danger" />
                    </div>

                    <c:if test="${matricula.idMatriculaAluno == null}">
                        <div class="form-group">
                            <label for="usuario">Login de Usuário: </label>
                            <form:input path="usuario" class="form-control" placeholder="Login de Usuário" />
                            <form:errors path="usuario" cssClass="label label-danger" />
                        </div>

                        <div class="form-group">
                            <label for="senha">Senha: </label>
                            <form:input path="senha" type="password" class="form-control" placeholder="Senha" />
                            <form:errors path="senha" cssClass="label label-danger" />
                        </div>
                    </c:if>

                    <div class="form-group">
                        <label for="sexo">Sexo: </label>
                        <form:select path="sexo" class="form-control">
                            <form:options items="${ sexos }" itemLabel="desc" />
                        </form:select>
                    </div>

                    <div class="form-group">
                        <label for="perfil"> Perfil de Acesso: </label>
                        <form:select path="perfil" class="form-control">
                            <form:options items="${ perfis }" itemLabel="descricao" />
                        </form:select>
                    </div>

                    <div class="form-group">
                        <label for="dtNascimento">Data de Nascimento</label>
                        <form:input path="dtNascimento" class="form-control" type="date" placeholder="dd/mm/aaaa" />
                        <form:errors path="dtNascimento" cssClass="label label-danger" />
                    </div>

                    <div class="form-group">
                        <label for="email">E-mail: </label>
                        <form:input path="email" class="form-control" placeholder="E-mail" />
                        <form:errors path="email" cssClass="label label-danger" />
                    </div>

                    <div class="form-group">
                        <label for="Telefone">Telefone: </label>
                        <form:input path="telefone" class="form-control" type="number" placeholder="(99) 99999-9999" />
                        <form:errors path="telefone" cssClass="label label-danger" />
                    </div>

                </div>

                <br>

                <div class="form-control">

                    <h4>Dados do Endereço do Aluno</h4>

                    <div class="form-group">
                        <label for="estado">Estado: </label>
                        <form:input path="estado" class="form-control" placeholder="Estado" />
                        <form:errors path="estado" cssClass="label label-danger" />
                    </div>

                    <div class="form-group">
                        <label for="cidade">Cidade: </label>
                        <form:input path="cidade" class="form-control" placeholder="Cidade" />
                        <form:errors path="cidade" cssClass="label label-danger" />
                    </div>

                    <div class="form-group">
                        <label for="bairro">Bairro: </label>
                        <form:input path="bairro" class="form-control" placeholder="Bairro" />
                        <form:errors path="bairro" cssClass="label label-danger" />
                    </div>

                    <div class="form-group">
                        <label for="rua">Rua: </label>
                        <form:input path="rua" class="form-control" placeholder="Rua" />
                        <form:errors path="rua" cssClass="label label-danger" />
                    </div>

                    <div class="form-group">
                        <label for="cep">CEP: </label>
                        <form:input path="cep" class="form-control" type="number" placeholder="CEP" />
                        <form:errors path="cep" cssClass="label label-danger" />
                    </div>

                    <div class="form-group">
                        <label for="complemento">Complemento: </label>
                        <form:input path="complemento" class="form-control" placeholder="Complemento" />
                        <form:errors path="complemento" cssClass="label label-danger" />
                    </div>

                    <div class="form-group">
                        <label for="numero">Número: </label>
                        <form:input path="numero" class="form-control" type="number" placeholder="Número" />
                        <form:errors path="numero" cssClass="label label-danger" />
                    </div>

                </div>

                <br>

                <div class="form-control">

                    <h4>Curso</h4>

                    <div class="form-group">
                        <label>Curso:</label>
                        <form:select path="idCurso" id="idCurso" class="form-control">
                            <option value="0">Informe o curso</option>
                            <c:forEach items="${cursos}" var="curso">
                                <option value="${curso.id}">${curso.nome}</option>
                            </c:forEach>
                        </form:select>
                    </div>

                </div>

                <br>

                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Confirmar</button>
                </div>
            </form:form>
        </div>

    </div>

    <%--Footer--%>
    <footer class="sticky-footer">
        <div class="container">
            <div class="text-center">
                <small>Copyright © Faculdade FEAN</small>
            </div>
        </div>
    </footer>
    <!-- Logout Modal-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
         aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Tem certeza?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Selecione "Logout" se você quer deixar a sessão atual.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancelar</button>
                    <a class="btn btn-primary" href="/SistemaFean">Logout</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <%--<link href="<c:url value="/assets/vendor/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css">--%>
    <script src="<c:url value="/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
    <!-- Core plugin JavaScript-->
    <script src="<c:url value="/assets/vendor/jquery-easing/jquery.easing.min.js"/>"></script>
    <!-- Page level plugin JavaScript-->
    <%--<script src="<c:url value="/assets/vendor/chart.js/Chart.min.js"/>"></script>--%>
    <!-- Custom scripts for all pages-->
    <script src="<c:url value="/assets/js/sb-admin.min.js"/>"></script>
    <!-- Custom scripts for this page-->
    <%--<script src="<c:url value="/assets/js/sb-admin-charts.js"/>"></script>--%>
</div>
</body>

</html>
