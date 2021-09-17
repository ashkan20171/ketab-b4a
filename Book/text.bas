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

End Sub

Sub Globals
	Private btn_share As Button
	Private ScrollView1 As ScrollView
	Private Label1 As Label
	Private Panel1 As Panel
	Private ScrollView1 As ScrollView
	Dim lbl As Label
	Dim ts As TextSetting
	Dim fara As Farakhani
	Dim send1 As send
	Dim result1 As Int
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("text")
ToastMessageShow("برای برگشت از کیلید فیزیکی استفاده کنید",True)
ProgressDialogShow("بارگزاری...")
load
fara.FarakhaniMatn("data.db",list.SQl1,list.cur,"SELECT * FROM tbl1 WHERE id=",list.meghdar,Label1,"titr")
ProgressDialogHide
End Sub

Sub load
	lbl.Initialize("")
	lbl.Typeface=Typeface.LoadFromAssets("iran sans.ttf")
	lbl.Gravity=Gravity.CENTER
	lbl.TextColor=Colors.White
	fara.FarakhaniMatn("data.db",list.SQL1,list.cur,"SELECT * FROM tbl1 where id=",list.meghdar,lbl,"matn")
	ts.Initialize
	ScrollView1.Panel.AddView(lbl,0,0,97%x,100%y)
	ts.LongText(lbl,lbl.Text,15,ScrollView1,1.8)
End Sub

Sub btn_share_Click
	result1 = Msgbox2("آیا قصد به اشتراک گذاشتن این مطلب را دارید؟","اشتراک گذاری","بله","خیر","",Null)
	If result1 = DialogResponse.POSITIVE Then
	send1.Initialize
	send1.ersalmatn(lbl.Text,"other")
	Else If result1 = DialogResponse.CANCEL Then
	ToastMessageShow("اشترک گذاری لغو شد",False)
	End If
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 
	If KeyCode = KeyCodes.KEYCODE_BACK Then
StartActivity(list)
Activity.Finish
	End If

End Sub