var today = new Date();

var year = today.getFullYear();
var month = today.getMonth() + 1;
var date = today.getDate();
var day = new Date(year, month - 1, 1).getDay();
var contents = "";

var main = {
  init: function() {
    var _this = this;

    $("#thisMonth")[0].value = month + "월";

    contents += "<div class='btn-group-toggle' data-toggle='buttons'>";
    for (var i = 0; i < day; i += 1) {
      _this.addCalendarBlankSpace();
    }
    contents += "</div>";

    $("#calendar").append(contents);
  },
  addCalendarBlankSpace: function() {
    contents +=
      "<label class='btn btn-outline-dark' style='margin-right:4px' disable ></label>";
  }
};

// # 요일 계산
/*
day = day == 0 ? "일" : day;
day = day == 1 ? "월" : day;
day = day == 2 ? "화" : day;
day = day == 3 ? "수" : day;
day = day == 4 ? "목" : day;
day = day == 5 ? "금" : day;
day = day == 6 ? "토" : day;
*/
alert(year + "년 " + month + "월 " + "1일은 " + day + "요일 ");

var totalCount = 0;
/*
contents +=
  "<label class='btn btn-outline-danger' onclick='dayCheck()'>" +
  "<input type='checkbox' id='day' style='display:none' >1" +
  "</label>";
*/
function dayCheck() {
  totalCount += 1;
  document.getElementById("totalCountValue").value =
    "총 " + totalCount + "장을 읽었습니다!";
}

main.init();
