<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Memes</title>
</head>
<body>
<br>
<br>
<form:form action="manufacturer" method="post" modelAttribute="car">
    <form:label path="manufacturer">Search by Manufacturer:</form:label>
    <form:input path="manufacturer"/><br/>
    <form:button>Search by Manufacturer</form:button>
</form:form><br>

<form:form action="productionYear" method="post" modelAttribute="car">
    <form:label path="productionYear">Search by Production year:</form:label>
    <form:input path="productionYear"/><br/>
    <form:button>Search by Production Year</form:button><br>

    <h1>Select Fuel type: </h1>
</form:form>
<form:form action="consumptionType" method="post" modelAttribute="car">
    <form:radiobutton path="consumptionType" value="fuel" label="Fuel"></form:radiobutton>
    <form:radiobutton path="consumptionType" value="electric" label="Electric"></form:radiobutton>
    <form:radiobutton path="consumptionType" value="hybrid" label="Hybrid"></form:radiobutton><br>
    <form:label path="consumption"> Enter consumption amount: </form:label>
    <form:input path="consumption"></form:input>
    <form:button>Search by Consumption</form:button>
</form:form><br>


<c:choose>
    <c:when test="${cars.size() > 0}">
        <table style="width:45% ; border: 1px solid black ; ">
            <tr>
                <th>Manufacturer</th>
                <th>Model</th>
                <th>Production Year</th>
                <th>HorsePower</th>
                <th>Consumption Type</th>
                <th>Consumption</th>
                <th>Price</th>
            </tr>
            <c:forEach items="${cars}" var="car">
                <tr >
                    <td style="border: 1px solid black">${car.manufacturer}</td>
                    <td style="border: 1px solid black">${car.model}</td>
                    <td style="border: 1px solid black">${car.productionYear}</td>
                    <td style="border: 1px solid black">${car.horsepower}</td>
                    <td style="border: 1px solid black">${car.consumptionType}</td>
                    <td style="border: 1px solid black">${car.consumption}</td>
                    <td style="border: 1px solid black">${car.price}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h1>No results found!</h1>
    </c:otherwise>
</c:choose>


</body>

</html>