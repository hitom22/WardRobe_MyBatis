<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>OpentheWardrobe</title>

    <link rel="stylesheet" href="/resources/css/login2.css">
    <link rel="stylesheet" href="/resources/css/header.css">
    <link rel="stylesheet" href="/resources/css/main.css">
    <link rel="stylesheet" href="/resources/css/footer.css">

</head>

<body>

	<jsp:include page="/WEB-INF/views/include/nav.jsp"></jsp:include>



    <main>

        <div class="title">
            <h1>로그인</h1>
        </div>
        <div id="member-login" class="loginTabContetns resp_login_wrap resp_account_wrap Mt0">
            <form name="loginForm" target="actionFrame" method="post" action="" onsubmit="return submitLoginForm(this)">
                <input type="hidden" name="return_url" value="/goods/view?no=1042111">
                <input type="hidden" name="order_auth" value="0">
                <input type="hidden" name="user_agent" value="browser" id="userAgent">
                <input type="hidden" name="token" value="" id="token">
                <fieldset>
                    <ul class="login_real_area">
                        <li class="input_area">
                            <div class="jt-input-group">
                                <input type="text" name="userid" id="userid" class="jt-input" value="" placeholder="아이디" pattern="\S+.*" required="">
                            </div>
                            <div class="jt-input-group">
                                <input type="password" name="password" id="password" class="jt-input" placeholder="비밀번호" pattern="\S+.*" required="">
                            </div>
                        </li>
                        <li class="login-checkbox-wrapper">
                            <div class="jt-checkbox-group">
                                <label class="jt-checkbox-v1">
                                    <input type="checkbox" name="idsave" id="idsave" value="checked">
                                    <i class="ic-check"></i>
                                    <span>아이디 저장</span>
                                </label>
                            </div>
                            <div class="jt-checkbox-group">
                                <label class="jt-checkbox-v1">
                                    <input type="checkbox" name="app_auto_login" id="keeplogin" value="checked" checked="checked">
                                    <i class="ic-check"></i>
                                    <span class="checkbox">로그인 유지</span>
                                </label>
                            </div>
                        </li>
                        <li>
                            <div class="c-btn-group">
                                <button type="submit" class="c-btn c-btn-black"><span designelement="text" textindex="1" texttemplatepath="cmVzcG9uc2l2ZV92ZXIxX2RlZmF1bHRfZ2wvbWVtYmVyL2plbnRlL2xvZ2luLmh0bWw=">로그인</span></button>
                            </div>
                            <div class="c-btn-group">
                                <a href="../login/register.html" class="c-btn c-btn-white" designelement="text" textindex="2" texttemplatepath="cmVzcG9uc2l2ZV92ZXIxX2RlZmF1bHRfZ2wvbWVtYmVyL2plbnRlL2xvZ2luLmh0bWw=">회원가입</a>
                            </div>
                        </li>
                        <li class="find_join">
                            <a href="/member/find?mode=findid" designelement="text" textindex="3" texttemplatepath="cmVzcG9uc2l2ZV92ZXIxX2RlZmF1bHRfZ2wvbWVtYmVyL2plbnRlL2xvZ2luLmh0bWw=">아이디 찾기</a>
                            <a href="/member/find?mode=findpw" designelement="text" textindex="4" texttemplatepath="cmVzcG9uc2l2ZV92ZXIxX2RlZmF1bHRfZ2wvbWVtYmVyL2plbnRlL2xvZ2luLmh0bWw=">비밀번호 찾기</a>
                        </li>
                        <li>
        
                            <!-- <a href="/member/guest_order_verify" class="guest-order-detail">비회원 주문 조회</a> -->
                        </li>
                    </ul>
                </fieldset>
            </form>
        </div>

    </main>



	<jsp:include page="/WEB-INF/views/include/footer.jsp"></jsp:include>
	
</body>
</html>