<%-- 
    Document   : viewfil
    Created on : Jan 21, 2022, 2:38:02 PM
    Author     : ACHAHBAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GESTION DES FILIERES</title>
              <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

    </head>
    <body>
 
      <div class="container mt-4">
            <div class="card border-info">
                 <div class="card-header bg-info text-white">
                     <h1> <center> GESTION DES FILIERES </center> </h1>
                </div>
                <br>
                <div class="card-header bg-info text-white">
         
                    <a href="${pageContext.request.contextPath}/filiere/nvfil" class="btn btn-light">Ajout d'un filiere</a>
                </div>
                
                <div class="card-header bg-info text-white">
         
                    <a href="${pageContext.request.contextPath}/" class="btn btn-light">Gestion des etudiants</a>
                </div>
                
                <div class="card-body"> 
<table class="table table-hover">  
  <thead>
   <tr>
    <th colspan=5>LISTE DES FILIERES</th>
    </tr>
    <th>ID Filiere</th>
    <th>Code Filiere</th>
    <th>Designation</th>
    <th>MODIFIER</th>
    <th>SUPPRIMER</th>
   </tr>  

   </thead>
   <tbody>
   <c:forEach var="fil" items="${liste}">

   <tr>  
   <td>${fil.idfiliere}</td>  
   <td>${fil.codefiliere}</td>  
   <td>${fil.designation}</td> 
   <td><a href="${pageContext.request.contextPath}/filiere/editfil?id=${fil.idfiliere}"  class="btn btn-warning">Edit</a></td> 
   <td><a href="${pageContext.request.contextPath}/filiere/deletefil?id=${fil.idfiliere}" 
          onclick="if (!(confirm('Etes vous sur de vouloir supprimer cet etudiant ?'))) return false" class="btn btn-danger">Delete</a></td>  
   </tr>  
   </c:forEach> 
      </tbody>
   </table> 
   </div>
 </div>
            
        </div>
  
    </body>
</html>