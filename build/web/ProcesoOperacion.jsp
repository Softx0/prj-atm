<%-- 
    Document   : ProcesoOperacion
    Created on : May 24, 2018, 8:33:02 PM
    Author     : ingva
--%>
<%@page import="com.BancoMPV.datos.BankRemote"%>
<!--Directiva para importar las clases del lado del servidor -->
<%@page import="com.BancoMPV.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Operaciones</title>
    </head>
    <body>
        <%
            BankRemote remote = (BankRemote) session.getAttribute("remote");
            String operacion = request.getParameter("operacion");
            String cantidad = request.getParameter("cantidad");

            //Entonces evaluamos cada metodo
            //Evaluamos si el usuario eligio alguna opcion
            if (operacion != null) {
                //Evaluamos si es el deposito
                if (operacion.equals("deposito")) {
                    remote.deposito(Integer.parseInt(cantidad));
                    out.println("Deposito realizado exitosamente!");

                } else if (operacion.equals("retiro")) {

                    boolean estado = remote.retiro(Integer.parseInt(cantidad));

                    if (estado) {
                        out.println("Cantidad retirada exitosamente!!!");
                    } else {
                        out.println("Su cuenta de banco no cuenta con todo ese dinero, eres pobre!!!");
                    }
                } else {
                    out.println("Tu Balance Actual es: $" + remote.getBalance());
                }
            }
        %>
        <hr/>

        <jsp:include page="Operaciones.jsp"></jsp:include>
    </body>
</html>
