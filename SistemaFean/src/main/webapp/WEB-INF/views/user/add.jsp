<%--
  Created by IntelliJ IDEA.
  User: tiano
  Date: 31/10/2017
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
    <title>Cadastro de Usuários</title>
</head>
<body>
    <div class="container">
        <h1>Cadastro de Usuários</h1>
        <hr>
        <div>
            <spring:url value="/usuario/todos" var="home" />
            <a class="btn btn-default" href="${home}">Home</a>
        </div>
        <hr>

        <div>
            <spring:url value="${ usuario.id == null ? '/usuario/save' : '/usuario/update' }" var="save" />
            <form:form modelAttribute="usuario" action="${save}" method="post">
                <form:hidden path="id" />
                <div class="form-group">
                    <label for="nome">Nome: </label>
                    <form:input path="nome" class="form-control" />
                    <form:errors path="nome" cssClass="label label-danger" />
                </div>

                <div class="form-group">
                    <label for="login">Login de Usuário: </label>
                    <form:input path="usuario" class="form-control" />
                    <form:errors path="usuario" cssClass="label label-danger" />
                </div>

                <div class="form-group">
                    <label for="senha">Senha: </label>
                    <form:input path="senha" class="form-control" />
                    <form:errors path="senha" cssClass="label label-danger" />
                </div>

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
                    <form:input path="dtNascimento" class="form-control" type="date" />
                    <form:errors path="dtNascimento" cssClass="label label-danger" />
                </div>

                <div class="form-group">
                    <label for="email">E-mail: </label>
                    <form:input path="email" class="form-control" />
                    <form:errors path="email" cssClass="label label-danger" />
                </div>

                <div class="form-group">
                    <label for="Telefone">Telefone: </label>
                    <form:input path="telefone" class="form-control" />
                    <form:errors path="telefone" cssClass="label label-danger" />
                </div>

                <div class="form-group">
                    <button type="submit" class="btn btn-primary">Confirmar</button>
                </div>
            </form:form>
        </div>

        <hr>

        <footer class="footer">
            <p>&copy; 2017 Sistema de Gestão FEAN</p>
        </footer>
    </div>
</body>
</html>
