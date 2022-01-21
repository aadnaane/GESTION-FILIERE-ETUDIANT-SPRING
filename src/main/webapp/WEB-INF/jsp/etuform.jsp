<%-- 
    Document   : etuform
    Created on : Jan 21, 2022, 12:30:39 AM
    Author     : ACHAHBAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AJOUT ETUDIANT</title>
        
           <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

    </head>
    <body>
       <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Nouvel Etudiant</h4>
                </div>
                <div class="card-body">
       <form:form method="post" action="Save">    
            <table>    
                <tr>    
          <td>Id Etudiant : </td>   
          <td><form:input path="idetudiant"  class="form-control" /></td>  
         </tr>    
         <tr>    
          <td>CNE :</td>    
          <td><form:input path="cne" class="form-control" /></td>  
         </tr>  
          <tr>    
          <td>NOM :</td>    
          <td><form:input path="nom" class="form-control" /></td>  
         </tr> 
         <tr>    
          <td>PRENOM :</td>    
          <td><form:input path="prenom" class="form-control" />
              </td>  
         </tr>
         <tr>    
          <td>ID FILIERE :</td>    
          <td>
              <form:select path="idfiliere" class="form-control" >
                  <c:forEach var="fil" items="${listfil}">
                      <form:option value="${fil.idfiliere}" label="${fil.idfiliere}"/>
                  </c:forEach>
              </form:select>
             
          </td>  
         </tr>
         <tr>     
          <td><input type="submit" value="Ajouter"  class="btn btn-success"/></td> 
          <td> <a href="listetu" class="btn btn-primary">Annuler</a> </td>
         </tr>    
        </table>    
       </form:form>   
          </div>
            </div>
        </div>
    </body>
</html>
