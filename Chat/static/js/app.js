$(document).ready(function(){function e(e,n){var a=$(document.createElement("li")).addClass("message "+(n?"external":"internal")),o=$(document.createElement("div")).text(e.message).css({backgroundColor:e.color}).attr("data-color",e.color),r=$(document.createElement("div")).addClass("tip").css({borderColor:e.color}),s=$(document.createElement("div")).text(e.nickname);o.addClass("text"),o.append(r),s.addClass("nickname"),n?a.append(o,s):a.append(s,o),c.append(a),t()}function n(e){var n=$(document.createElement("li")).addClass("info");n.text(e.message),c.append(n),t()}function t(){c.scrollTop(c[0].scrollHeight)}var a=io.connect(),o=$(".chatBody .welcomeBlock"),r=o.find(".nicknameForm"),s=r.find(".nicknameInput"),d=$(".chatBody .chatBlock"),c=d.find(".messageList"),i=d.find(".messageForm"),m=i.find(".indicator"),l=i.find(".messageInput"),u=400,f=!1,p=!1;$(".nicknameForm").submit(function(e){var n=s.val().trim();s.attr("disabled",!0),s.blur(),e.preventDefault(),n&&!f&&(f=!0,a.emit("enter",{nickname:n}),a.on("enter response",function(e){if(e.accepted)p=!0,r.find(".error").addClass("hidden"),o.addClass("hidden"),setTimeout(function(){o.remove(),d.removeClass("hidden"),l.focus()},500);else{r.find(".error").remove();var n=$(document.createElement("p")).addClass("error").text(e.message);r.append(n),s.removeAttr("disabled"),s.focus(),f=!1}}))}),l.keyup(function(){var e=$(this).val(),n=e.length,t=u-n;0===n?m.empty():(m.text(t),m.attr("class","indicator "+(0>t?"bad":"")))}),i.submit(function(e){var n=l.val().trim();e.preventDefault(),n&&(a.emit("message",{message:n}),l.val(""),m.empty(),i.find(".error").remove())}),a.on("message",function(n){p&&e(n,n.external)}),a.on("message response",function(e){var n=$(document.createElement("p")).addClass("error").text(e.message);i.append(n)}),a.on("info",fun
