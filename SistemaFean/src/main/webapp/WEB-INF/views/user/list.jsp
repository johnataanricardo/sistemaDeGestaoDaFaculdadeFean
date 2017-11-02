<%--
  Created by IntelliJ IDEA.
  User: tiano
  Date: 31/10/2017
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lista de usuários</title>
    <spring:url var="css" value="/static/css/bootstrap.css"/>
    <link type="text/css" rel="stylesheet" href="${ css }" />
</head>

<body>
    <div class="container">
        <h1>Lista de Usuários</h1>
    </div>
    <hr>

    <div>
        <spring:url value="/usuario/cadastro" var="cadastro" />
        <a class="btn btn-default" href="${ cadastro }">Novo usuário</a>
    </div>
    <hr>

    <div class="panel-default">

        <div class="panel-heading">
            <span>${ message == null ? '&nbsp' : message }</span>
        </div>

     <table class="table table-striped table-condensed">

         <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Data de Nascimento</th>
                <th>E-mail</th>
                <th>Sexo</th>
                <th>Perfil de Acesso</th>
                <th>Telefone</th>
                <th>Ação</th>
            </tr>
         </thead>

         <tbody>
            <c:forEach var="usuario" items="${ usuarios }">
                <tr>
                    <td>${ usuario.id }</td>
                    <td>${ usuario.nome }</td>

                    <td>
                        <f:parseDate var="date" value="${ usuario.dtNascimento }" pattern="yyyy-MM-dd" type="date" />
                        <f:formatDate value="${ date }" pattern="dd/MM/yyyy" type="date" />
                    </td>

                    <td> ${ usuario.email } </td>
                    <td> ${ usuario.sexo.desc } </td>
                    <td> ${ usuario.perfil.descricao } </td>
                    <td> ${ usuario.telefone } </td>

                    <td>
                        <spring:url value="/usuario/update/${ usuario.id }" var="update" />
                        <a class="btn btn-info" href="${ update }">Editar</a>

                        <spring:url value="/usuario/delete/${ usuario.id }" var="delete" />
                        <a class="btn btn-danger" href="${ delete }">Excluir</a>
                    </td>
                </tr>
            </c:forEach>
         </tbody>
     </table>
    </div   >
</body>
</html>
