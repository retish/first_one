<%@ page import="edu.cheezelovers.firstweb.db.PostDao" %>
<%@ page import="edu.cheezelovers.firstweb.vo.Post" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: kristina
  Date: 3/28/15
  Time: 11:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
    <link href="resources/style.css" rel="stylesheet">
</head>
<body>

    <div class="wrapper">
        <header class="header">

        </header>
        <section>
            <ul class="post">
                <%
                    PostDao dao = new PostDao();
                    List<Post> posts = dao.getPosts();
                    for (Post post : posts) {
                %>
                <li>
                    <h2><%=post.subject%></h2>
                    <p>
                        <i><%=post.date%></i> by <strong><%=post.name%></strong>
                    </p>
                    <p><%=post.text%></p>
                    <a href="#" onclick="deletePost(<%=post.id%>)"><img src="resources/remove.jpg"></a> <%--тут должна быть кнопочка! --%>
                </li>
                <%

                    }

                %>
            </ul>

        </section>


        <section>
            <form action="post" method="post" class="postcreate">
               <div>
                    <label>Ваше имя</label>
                    <input name="name" size="30"/>
                </div>
                <div>
                    <label>Заголовок поста</label>
                    <input name="subject" size="54"/>
                </div>
                <div>
                    <textarea rows="10" cols="71" name="text"></textarea>
                </div>
                <div class="sentbt">
                    <%--<input type="submit" value="Отправить"/>--%>
                    <a href="#" onclick="document.forms[0].submit(); return false;">Send</a>
                </div>
            </form>
        </section>

        <script type="text/javascript">
            function deletePost(id) {
                $.ajax({
                    method: "DELETE",
                    url: "/post?id="+id
                }).done(function() {
                    window.location='';
                });
            }
        </script>

    </div>

</body>
</html>