<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Library</title>

</head>
<body>
<h2>The Library</h2>
    <table border=2>
    <tr>
        <th> Author </th>
        <th> Name </th>
        <th> Pages </th>
        <th> Rating </th>
    </tr>

    <c:forEach var="item" items="${info}">
            <tr>
                <td> <c:out value="${item.author}"/> </td>
                <td> <c:out value="${item.name}"/> </td>
                <td> <c:out value="${item.pages}"/> </td>
                <td> <c:out value="${item.rating}"/> </td>
            </tr>
        </c:forEach>
    </table>
    <form action="/books/add">
            <p> Insert author <input type="text" name="author"/> <p/>
            <p> Insert name <input type="text" name="name"/> <p/>
            <p> Insert number of pages <input type="text" name="pages"/> <p/>
            <p> Insert rating <input type="text" name="rating"/> <p/>
            <p> <input type="submit"/> </p>
        </form>



</body>
</html>