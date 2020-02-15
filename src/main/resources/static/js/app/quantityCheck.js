var url = new URL(window.location.href);
var purpose = url.searchParams.get("purpose");
$("#title")[0].value = purpose + "독방 읽은 성경 수 체크";

var today = new Date();

var year = today.getFullYear();
var month = today.getMonth() + 1;
var date = today.getDate();
var day = new Date(year, month - 1, 1).getDay();
var contents = "";
var totalCount = 0;
var i;

var main = {
  init: function() {
    var _this = this;

    $("#thisMonth")[0].value = month + "월";

    $.ajax({
      type: "GET",
      url: "/api/quantity/" + purpose,
      dataType: "json",
      contentType: "application/json; charset=utf-8",
      data: JSON
    })
      .done(function(data) {
        //alert(data[0]["date"] + " " + data.length);

        for (i = 0; i < day + data.length; i += 1) {
          if (i % 7 == 0 || i == 0) _this.changeLine();
          if (i < day) _this.addCalendarBlankSpace();
          if (i >= day) {
            _this.addCalendar(data[i - day]["totalCount"]);
          }
          if (i % 7 == 6 || i == day + data.length - 1) _this.lastLine();
        }
        _this.drawCalendar();
      })
      .fail(function(error) {
        alert(JSON.stringify(error));
      });
  },
  addCalendarBlankSpace: function() {
    contents +=
      "<label class='btn btn-outline-dark' style='margin-right:4px; height:38px' disable >" +
      "<input type='checkbox' disable></input>" +
      "</label>";
  },
  addCalendar: function(totalReadingCount) {
    if (i % 7 == 0) {
      contents +=
        "<label class='btn btn-outline-danger' style='margin-right:4px' onclick='main.checkCalendar(this)'>";
    } else if (i % 7 == 6) {
      contents +=
        "<label class='btn btn-outline-primary' style='margin-right:4px' onclick='main.checkCalendar(this)'>";
    } else {
      contents +=
        "<label class='btn btn-outline-success' style='margin-right:4px' onclick='main.checkCalendar(this)'>";
    }
    contents +=
      "<input type='checkbox' value='" +
      totalReadingCount +
      "'>" +
      (i - day + 1) +
      "</input>" +
      "</label>";
  },
  changeLine: function() {
    contents += "<div class='btn-group-toggle' data-toggle='buttons'>";
    //alert(i);
  },
  lastLine: function() {
    contents += "</div>";
  },
  drawCalendar: function() {
    $("#calendar").append(contents);
  },
  checkCalendar: function(thisDay) {
    checkbox = thisDay.children[0];
    if (checkbox.checked == false) {
      totalCount += Number(checkbox.value);
      $("#totalCountValue")[0].value = "총 " + totalCount + "장 읽었습니다!";
    } else if (checkbox.checked == true) {
      totalCount -= Number(checkbox.value);
      $("#totalCountValue")[0].value = "총 " + totalCount + "장 읽었습니다!";
    }
    //alert(thisDay.className);
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
//alert(year + "년 " + month + "월 " + "1일은 " + day + "요일 ");

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
