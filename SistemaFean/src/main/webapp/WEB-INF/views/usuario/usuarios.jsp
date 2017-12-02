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
    <!-- Page level plugin CSS-->
    <link href="<c:url value="/assets/vendor/datatables/dataTables.bootstrap4.css"/>" rel="stylesheet" type="text/css">
    <!-- Custom styles for this template-->
    <link href="<c:url value="/assets/css/sb-admin.css"/>" rel="stylesheet" type="text/css">
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
            <li>Cadastros / Usuários</li>
        </ol>

        <h1>Usuários</h1>

        <div class="panel-heading">
            <span>${ message == null ? '&nbsp' : message }</span>
        </div>

        <div class="card mb-3">
            <div class="card-header">
                <i class="fa fa-table"></i> Usuários
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                        <tr>
                            <th>Nome</th>
                            <th>Data de Nascimento</th>
                            <th>E-mail</th>
                            <th>Telefone</th>
                            <th>Perfil de Acesso</th>
                            <th>Ações</th>
                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>Nome</th>
                            <th>Data de Nascimento</th>
                            <th>E-mail</th>
                            <th>Telefone</th>
                            <th>Perfil de Acesso</th>
                            <th>Ações</th>
                        </tr>
                        </tfoot>
                        <tbody>
                        <c:forEach var="usuario" items="${ usuarios }">
                            <tr>
                                <td>${ usuario.nome }</td>
                                <td> ${usuario.dtNascimento}
                                    <%--<f:parseDate var="date" value="${ usuario.dtNascimento }" pattern="yyyy-MM-dd"--%>
                                                 <%--type="date"/>--%>
                                    <%--<f:formatDate value="${ date }" pattern="dd/MM/yyyy" type="date"/>--%>
                                </td>
                                <td> ${ usuario.email } </td>
                                <td> ${ usuario.telefone } </td>
                                <td> ${ usuario.perfil.descricao } </td>
                                <td class="center">
                                <spring:url value="/usuario/update/${ usuario.id }" var="update" />
                                <a class="fa fa-pencil-square-o fa-lg" title="Editar" href="${ update }"></a>

                                <spring:url value="/usuario/delete/${ usuario.id }" var="delete" />
                                <a class="fa fa-times fa-lg" title="Excluir" href="${ delete }"></a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="card-footer small text-muted">
                <div>
                    <spring:url value="/usuario/cadastro" var="cadastro" />
                    <a class="btn btn-primary" href="${ cadastro }">Novo Usuário</a>
                </div>
            </div>
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
    <script src="<c:url value="/assets/vendor/jquery/jquery.min.js"/> "></script>
    <script src="<c:url value="/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>
    <!-- Core plugin JavaScript-->
    <script src="<c:url value="/assets/vendor/jquery-easing/jquery.easing.min.js"/>"></script>
    <!-- Page level plugin JavaScript-->
    <script src="<c:url value="/assets/vendor/chart.js/Chart.min.js"/>"></script>
    <script src="<c:url value="/assets/vendor/datatables/jquery.dataTables.js"/>"></script>
    <script src="<c:url value="/assets/vendor/datatables/dataTables.bootstrap4.js"/>"></script>
    <!-- Custom scripts for all pages-->
    <script src="<c:url value="/assets/js/sb-admin.min.js"/>"></script>
    <!-- Custom scripts for this page-->
    <script src="<c:url value="/assets/js/sb-admin-datatables.min.js"/>"></script>
    <script src="<c:url value="/assets/js/sb-admin-charts.js"/>"></script>
</div>
</body>

</html>
