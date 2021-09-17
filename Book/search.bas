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

	Private EditText1 As EditText
	Private L As ListView
	Private Label1 As Label
	Private Panel1 As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("search")
load
End Sub

Sub load
	L.SingleLineLayout.Label.Gravity=Gravity.CENTER
	L.SingleLineLayout.Label.Typeface=Typeface.LoadFromAssets("iran sans.ttf")
	L.SingleLineLayout.Label.TextSize = 15
	L.SingleLineLayout.Label.TextColor=Colors.Black
	L.SingleLineLayout.ItemHeight = 43dip

End Sub

Sub L_ItemClick (Position As Int, Value As Object)
list.meghdar=Value
StartActivity("text")
Activity.Finish	
End Sub

Sub EditText1_TextChanged (Old As String, New As String)
		L.Clear
	fara.SingleLineTitr("data.db",list.SQL1,list.cur,"SELECT * FROM tbl1 WHERE titr LIKE '%" & EditText1.text & "%' ",L,"titr","id")
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 
	If KeyCode = KeyCodes.KEYCODE_BACK Then
StartActivity(Main)
Activity.Finish
	End If

End Sub