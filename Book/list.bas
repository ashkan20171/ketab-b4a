Type=Activity
Version=6.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: false
#End Region

Sub Process_Globals
Dim fara As Farakhani
Dim SQl1 As SQL
Dim cur As Cursor
Dim meghdar As String
End Sub

Sub Globals
	Private Label1 As Label
	Private Panel1 As Panel
	Private L As ListView

End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("list")
	
	ProgressDialogShow("بارگزاری...")
vasibele
load
ProgressDialogHide
End Sub

Sub vasibele'تنظیمات ظاهری لیست ویو
L.SingleLineLayout.Label.Gravity=Gravity.CENTER
L.SingleLineLayout.Label.Typeface=Typeface.LoadFromAssets("iran sans.ttf")
L.SingleLineLayout.Label.TextSize = 15
L.SingleLineLayout.Label.TextColor=Colors.White
L.SingleLineLayout.ItemHeight = 43dip

End Sub

Sub load'فراخانی اطلاعات از دیتا بیس  
	fara.SingleLineTitr("data.db",SQl1,cur,"SELECT * FROM tbl1",L,"titr","id")
	
End Sub


Sub L_ItemClick (Position As Int, Value As Object)'نمایش متن
		meghdar = Value
	StartActivity(text)
	Activity.Finish
End Sub

Sub L_ItemLongClick (Position As Int, Value As Object)'اظافه کردن به علاقه مندی ها
	Dim cur As Cursor
	cur = SQl1.ExecQuery("SELECT * FROM tbl1")
	cur.Position = Value - 1
	Dim fav As Int = cur.GetInt("fave")
	Dim num As Int = cur.GetInt("id")
	If fav = 0 Then		
			SQl1.ExecNonQuery("UPDATE tbl1 SET fave = 1 WHERE id=" & num)
			ToastMessageShow("به علاقه مندی ها اضافه شد!!!",False)
	Else
			SQl1.ExecNonQuery("UPDATE tbl1 SET fave = 0 WHERE id=" & num)
			ToastMessageShow("از علاقه مندی ها حذف شد!", False)
	End If	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 
	If KeyCode = KeyCodes.KEYCODE_BACK Then
StartActivity(Main)
Activity.Finish
	End If

End Sub
