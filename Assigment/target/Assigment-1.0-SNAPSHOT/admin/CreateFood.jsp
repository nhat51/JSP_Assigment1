
<%@ page import="java.util.HashMap" %>
<%@ page import="com.example.assigment1.assigment.entity.Food" %><%--
  Created by IntelliJ IDEA.
  User: it
  Date: 12/7/2021
  Time: 10:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%
  request.setCharacterEncoding("utf-8");
  Food food = (Food) request.getAttribute("product");
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <jsp:include page="../include/head.jsp">
    <jsp:param name="title" value="Tạo Sản Phẩm"/>
  </jsp:include>
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">

  <jsp:include page="/include/header.jsp"/>

  <jsp:include page="/include/aside/aside.jsp"/>

  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Add Product</h1>
            <a href="/admin/list">Back To List</a>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <!-- left column -->
          <div class="col-md-10">
            <!-- general form elements -->
            <div class="card card-primary">
              <!-- form start -->
              <form action="/admin/create" method="post">
                <div class="card-body">
                 <%-- <div class="form-group" hidden>
                    <label for="ID"> ID</label>
                    <input type="text" name="ID" class="form-control" id="ID">
                  </div>--%>
                  <div class="form-group">
                    <label for="ProductName">Food Name</label>
                    <input type="text" name="name" class="form-control" value="<%= food.getName()%>" id="ProductName">

                  </div>
                  <div class="form-group">
                    <label for="Description">Description</label>
                    <input type="text" name="description" id="Description" class="form-control" value="<%= food.getDescription()%>" />

                  </div>
                  <div class="form-group">
                    <label for="Price">Price</label>
                    <input type="text" name="price" class="form-control" value="<%= food.getPrice()%>" id="Price">
                  </div>
                  <div class="form-group">
                    <label for="Image">Image</label>
                    <input type="text" name="image" class="form-control" value="<%= food.getThumbnail()%>" id="Image">
                  </div>
                  <div class="form-group">
                    <label for="Status">Status</label>
                    <input type="number" name="status" class="form-control" value="<%= food.getStatus()%>" id="Status">
                  </div>
                   <div class="form-group">
                     <label for="Status">Status</label>
                     <input type="number" name="categoryId" class="form-control" value="<%= food.getCategoryId()%>" id="CategoryId">
                   </div>
                </div>
                <!-- /.card-body -->
                <div class="card-footer">
                  <button type="submit" class="btn btn-primary">Submit</button>
                </div>
              </form>
            </div>
          </div>

        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="float-right d-none d-sm-block">
      <b>Version</b> 3.1.0
    </div>
    <strong>Copyright &copy; 2014-2021 <a href="https://adminlte.io">AdminLTE.io</a>.</strong> All rights reserved.
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="../resources/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="../resources/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="../resources/dist/js/demo.js"></script>
</body>
</html>

