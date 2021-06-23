<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>home</title>
</head>
<body>

<form action="/login">
    <#list hints as hint>
        <input type="checkbox" name="hintIdList[]" value=${hint.id}>${hint.name}<br>
    </#list>

    <input type="submit" value="提交">
</form>

</body>
</html>