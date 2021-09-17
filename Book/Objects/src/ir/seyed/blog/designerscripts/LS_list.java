package ir.seyed.blog.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_list{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[list/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="Panel1.SetLeftAndRight(0%x,100%x)"[list/General script]
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 4;BA.debugLine="Panel1.SetTopAndBottom(0%y,10%y)"[list/General script]
views.get("panel1").vw.setTop((int)((0d / 100 * height)));
views.get("panel1").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 6;BA.debugLine="Label1.SetLeftAndRight(20%x,80%x)"[list/General script]
views.get("label1").vw.setLeft((int)((20d / 100 * width)));
views.get("label1").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 7;BA.debugLine="Label1.SetTopAndBottom(1%y,9%y)"[list/General script]
views.get("label1").vw.setTop((int)((1d / 100 * height)));
views.get("label1").vw.setHeight((int)((9d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 9;BA.debugLine="L.SetLeftAndRight(0%x,100%x)"[list/General script]
views.get("l").vw.setLeft((int)((0d / 100 * width)));
views.get("l").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 10;BA.debugLine="L.SetTopAndBottom(10%y,90%y)"[list/General script]
views.get("l").vw.setTop((int)((10d / 100 * height)));
views.get("l").vw.setHeight((int)((90d / 100 * height) - ((10d / 100 * height))));
//BA.debugLineNum = 12;BA.debugLine="f.SetLeftAndRight(0%x,100%x)"[list/General script]
views.get("f").vw.setLeft((int)((0d / 100 * width)));
views.get("f").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 13;BA.debugLine="f.SetTopAndBottom(90%y,100%y)"[list/General script]
views.get("f").vw.setTop((int)((90d / 100 * height)));
views.get("f").vw.setHeight((int)((100d / 100 * height) - ((90d / 100 * height))));

}
}