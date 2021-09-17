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
End Sub

Sub Globals

	Private f As Label
	Private L As ListView
	Private Label1 As Label
	Private Panel1 As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("list")
Label1.Text="علاقه مندی ها"
load
End Sub

Sub load
	fara.SingleLineTitr("data.db",list.SQL1,list.cur,"SELECT * FROM tbl1 where fave = 1",L,"titr","id")
	L.SingleLineLayout.Label.Gravity=Gravity.CENTER
	L.SingleLineLayout.Label.Typeface=Typeface.LoadFromAssets("iran sans.ttf")
	L.SingleLineLayout.Label.TextSize = 15
	L.SingleLineLayout.Label.TextColor=Colors.Black
	L.SingleLineLayout.ItemHeight = 43dip

End Sub


Sub L_ItemClick (Position As Int, Value As Object)
list.meghdar=Value
StartActivity(text)
Activity.Finish	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 
	If KeyCode = KeyCodes.KEYCODE_BACK Then
StartActivity(Main)
Activity.Finish
	End If

End Sub