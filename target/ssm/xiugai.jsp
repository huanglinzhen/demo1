<%@ page import="com.hlz.domain.Member" %><%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2018/12/24
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>修改界面</title>
</head>
<body>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<form id="form2">
    <p>序号: <input  name="mid" value="${member.getMid()}"></p>
    <p>会员姓名：<input name="mname" value="${member.getMname()}"></p>
    <p>会员号码：<input  name="mphone" value="${member.getMphone()}"></p>
    <p>会员等级：<input name="mlevel" value="${member.getMlevel()}"></p>
    <p>卡号: <input name="mcardNo"  value="${member.getMcardNo()}"></p>

</form>
<button type="button" id="btn1" >保存</button>
<script>
    $(function(){

        alert("第一个弹窗")
        $("#btn1").click(function () {
            alert("第二个弹窗")
            $.ajax({
                url:"members/xiugai2",
                type:"post",
                data:$("#form2").serialize(),
                dataType:"json",
                success:function (data) {
                    if(data.count==1){
                        alert("修改成功")
                    }else {
                        alert("修改失败")
                    }
                }
            })
        })
    })
</script>
</body>
</html>
