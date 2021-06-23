<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>room</title>
</head>
<body>
hints:
<#list hints as hint>
    ${hint.name} <#sep>,
</#list>

<br>
<form action="/update">
    content: <textarea rows="10" cols="30">${content}</textarea>
    <input type="submit" value="提交">
</form>

</body>
</html>