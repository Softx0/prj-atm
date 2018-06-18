<%-- 
    Document   : Operaciones
    Created on : May 24, 2018, 8:31:43 PM
    Author     : ingva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operaciones</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/estilos.css" type="text/css">
    </head>
    <body>
        <fieldset id="container-form">
            <form action="ProcesoOperacion.jsp"> 
                <table width="300" id="one-column-emphasis">
                    <h3>
                        Bienvenido a la pagina de las Operaciones Bancarias
                    </h3>
                    <tr>
                        <td class="oce-first">
                            Ingrese una Cantidad:
                        </td>
                        <td>
                            <input class="default" type="number" name="cantidad" />
                        </td>
                    </tr>

                    <tr>
                        <td class="oce-first">
                            Escoga una transaccion:
                        </td>
                        <td>
                            <input class="default" type="radio" name="operacion" value="deposito"/>Depositar<br>
                            <input class="default" type="radio" name="operacion" value="retiro"/>Retirar<br>
                            <input class="default" type="radio" name="operacion" value="balance"/>Chequear Balance
                        </td>
                    </tr>

                    <tr style="text-align: center;">
                        <td>
                            <input type="reset" value="Limpiar" class="default">
                        </td>
                        <td>
                            <input type="submit" value="Enviar" class="default">
                        </td>
                    </tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>