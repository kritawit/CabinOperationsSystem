<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%--<a href="<c:url value="member/register" />" >Member Register</a>--%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Cabin Operations System
            <small>Version 1.0 (Beta)</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="<c:url value="/" />"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Administrator - Cabin Crew Profile</li>
        </ol>
    </section>
    <!-- Main content -->
    <section class="content">
        <div class="btn-group">
            <a href="<c:url value="/cabincrewadmin/cabincrewregister" />" class="btn btn-success">Add Cabin Crew</a>
        </div>
        <div class="btn-group">
            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
                    aria-expanded="false">
                Action <span class="caret"></span>
            </button>
            <ul class="dropdown-menu">
                <li><a href="#">Action</a></li>
                <li><a href="#">Another action</a></li>
                <li><a href="#">Something else here</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="#">Separated link</a></li>
            </ul>
        </div>

    </section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->
<%@include file="/WEB-INF/views/template/footer.jsp" %>