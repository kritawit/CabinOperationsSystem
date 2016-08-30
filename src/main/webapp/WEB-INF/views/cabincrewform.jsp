<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%--<link rel="stylesheet" href="<c:url value="/resources/css/cos-style.css"/> ">--%>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Cabin Operations System
            <small>Version 1.0 (Beta)</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="<c:url value="/" />"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="<c:url value="/cabincrewadmin/cabincrewprofile" />"><i class="fa fa-dashboard"></i>
                Administrator - Cabin Crew Profile</a></li>
            <li class="active">Administrator - Cabin Crew Profile (Register)</li>
        </ol>
    </section>
    <!-- Main content -->
    <section class="content">
        <div class="panel panel-default">
            <div class="panel-body">
                <form:form action="${pageContext.request.contextPath}" class="form-horizontal"
                           commandName="cabinCrewCombinded" role="form" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <div class="col-xs-2">
                            <label for="title" class="control-label">Title <span class="text-danger">*</span></label>
                            <select class="form-control" name="cabinCrew.title" id="title">
                                <option value="Mr." selected>Mr.</option>
                                <option value="Mrs.">Mrs.</option>
                                <option value="Miss">Miss</option>
                                <option value="Ms.">Ms.</option>
                            </select>
                        </div>
                        <div class="col-xs-4">
                            <label class="control-label" for="cabincrewpicture">Picture</label>
                            <form:input id="cabincrewpicture" path="cabinCrew.cabincrewpicture" type="file" accept="image/*" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4">
                            <label for="id_card" class="control-label">ID Card <span class="text-danger">*</span></label>
                            <form:input path="cabinCrew.id_card" id="id_card" class="form-control"/>
                        </div>
                        <div class="col-xs-4">
                            <label for="id_passport" class="control-label">ID Passport</label>
                            <form:input path="cabinCrew.id_passport" id="id_passport" class="form-control"/>
                        </div>
                        <div class="col-xs-4">
                            <label for="passport_exp" class="control-label">Passport Expire</label>
                            <form:input path="cabinCrew.passport_exp" id="passport_exp" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4">
                            <label for="firstname_th" class="control-label">First Name (ภาษาไทย) <span class="text-danger">*</span></label>
                            <form:input path="cabinCrew.firstname_th" id="firstname_th" class="form-control"/>
                        </div>
                        <div class="col-xs-4">
                            <label for="lastname_th" class="control-label">Last Name (ภาษาไทย) <span class="text-danger">*</span></label>
                            <form:input path="cabinCrew.lastname_th" id="lastname_th" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4">
                            <label for="firstname_en" class="control-label">First Name (English) <span class="text-danger">*</span></label>
                            <form:input path="cabinCrew.firstname_en" id="firstname_en" class="form-control"/>
                        </div>
                        <div class="col-xs-4">
                            <label for="lastname_en" class="control-label">Last Name (English) <span class="text-danger">*</span></label>
                            <form:input path="cabinCrew.lastname_en" id="lastname_en" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4">
                            <label for="nickname" class="control-label">Nick Name</label>
                            <form:input path="cabinCrew.nickname" id="nickname" class="form-control"/>
                        </div>
                        <div class="col-xs-4">
                            <label class="control-label">Gender <span class="text-danger">*</span></label>
                            <br>
                            <label class="radio-inline">
                                <input type="radio" name="cabinCrew.gender" id="gender1" value="male" checked/> Male
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="cabinCrew.gender" id="gender2" value="female"/> Female
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4">
                            <label for="birth_date" class="control-label">Birth Date <span class="text-danger">*</span></label>
                            <form:input path="cabinCrew.birth_date" id="birth_date" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4">
                            <label for="nationality" class="control-label">Nationality <span class="text-danger">*</span></label>
                            <form:input path="cabinCrew.nationality" id="nationality" class="form-control"/>
                        </div>
                        <div class="col-xs-4">
                            <label for="race" class="control-label">Race <span class="text-danger">*</span></label>
                            <form:input path="cabinCrew.race" id="race" class="form-control"/>
                        </div>
                        <div class="col-xs-4">
                            <label for="religion" class="control-label">Religion <span class="text-danger">*</span></label>
                            <form:input path="cabinCrew.religion" id="religion" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4">
                            <label for="position1" class="control-label">Position 1 <span class="text-danger">*</span></label>
                            <select class="form-control" name="cabinCrew.position1" id="position1">
                                <option value="" selected>Please Select.</option>
                                <option value="Mr.">Officer</option>
                                <option value="Mrs.">Purser</option>
                                <option value="Miss">Crew</option>
                            </select>
                        </div>
                        <div class="col-xs-4">
                            <label for="position2" class="control-label">Position 2</label>
                            <select class="form-control" name="cabinCrew.position2" id="position2">
                                <option value="" selected>Please Select.</option>
                                <option value="Mr.">Mr.</option>
                                <option value="Mrs.">Mrs.</option>
                                <option value="Miss">Miss</option>
                                <option value="Ms.">Ms.</option>
                            </select>
                        </div>
                        <div class="col-xs-4">
                            <label for="position3" class="control-label">Position 3</label>
                            <select class="form-control" name="cabinCrew.position3" id="position3">
                                <option value="" selected>Please Select.</option>
                                <option value="Mr.">Mr.</option>
                                <option value="Mrs.">Mrs.</option>
                                <option value="Miss">Miss</option>
                                <option value="Ms.">Ms.</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-2">
                            <label for="bacth_num" class="control-label">Batch No. <span class="text-danger">*</span></label>
                            <input type="number" name="cabinCrew.bacth_num" id="bacth_num" class="form-control"/>
                        </div>
                        <div class="col-xs-3">
                            <label for="bacth_num" class="control-label">Batch Year <span class="text-danger">*</span></label>
                            <input type="text" name="cabinCrew.batch_year" id="batch_year" class="form-control"
                                   placeholder="Year"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4">
                            <label for="bank_id" class="control-label">Bank ID <span class="text-danger">*</span></label>
                            <input type="text" name="cabinCrew.bank_id" id="bank_id" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4">
                            <label for="email" class="control-label">Email Address <span class="text-danger">*</span></label>
                            <input type="email" name="cabinCrew.email" id="email" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4">
                            <label for="tel" class="control-label">Tel. <span class="text-danger">*</span></label>
                            <input type="text" name="cabinCrew.tel" id="tel" class="form-control"/>
                        </div>
                        <div class="col-xs-4">
                            <label for="fax" class="control-label">Fax</label>
                            <input type="text" name="cabinCrew.fax" id="fax" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4">
                            <label for="mobile1" class="control-label">Mobile 1 <span class="text-danger">*</span></label>
                            <input type="text" name="cabinCrew.mobile1" id="mobile1" class="form-control"/>
                        </div>
                        <div class="col-xs-4">
                            <label for="mobile2" class="control-label">Mobile 2</label>
                            <input type="text" name="cabinCrew.mobile2" id="mobile2" class="form-control"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-6">
                            <label for="address" class="control-label">Address <span class="text-danger">*</span></label>
                            <form:textarea path="cabinCrew.address" id="address" cols="30" rows="4" maxlength="255" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-4">
                            <label for="city" class="control-label">City <span class="text-danger">*</span></label>
                            <form:input path="cabinCrew.city" id="city" class="form-control" />
                        </div>
                        <div class="col-xs-4">
                            <label for="country" class="control-label">Country <span class="text-danger">*</span></label>
                            <form:input path="cabinCrew.country" id="country" class="form-control"/>
                        </div>
                        <div class="col-xs-2">
                            <label for="zipcode" class="control-label">ZIP/Postal code <span class="text-danger">*</span></label>
                            <form:input path="cabinCrew.zipcode" id="zipcode" class="form-control" />
                        </div>
                    </div>
                    <legend></legend>
                    <div class="form-group">
                        <div class="col-xs-12" align="center">
                            <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-save"></span>
                                Submit
                            </button>
                            <input type="reset" value="Reset" class="btn btn-default"/>
                            <a href="<c:url value="/cabincrewadmin/cabincrewprofile" />" class="btn btn-info"><span
                                    class="glyphicon glyphicon-backward"></span> Back</a>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->
<%@include file="/WEB-INF/views/template/footer.jsp" %>