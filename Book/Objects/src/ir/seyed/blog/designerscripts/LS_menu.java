package ir.seyed.blog.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_menu{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("bg").vw.setLeft((int)((0d / 100 * width)));
views.get("bg").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("bg").vw.setTop((int)((0d / 100 * height)));
views.get("bg").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panel1").vw.setTop((int)((0d / 100 * height)));
views.get("panel1").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("label1").vw.setLeft((int)((20d / 100 * width)));
views.get("label1").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
views.get("label1").vw.setTop((int)((1d / 100 * height)));
views.get("label1").vw.setHeight((int)((9d / 100 * height) - ((1d / 100 * height))));
views.get("blog").vw.setLeft((int)((1d / 100 * width)));
views.get("blog").vw.setWidth((int)((15d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 13;BA.debugLine="blog.SetTopAndBottom(1%y,9%y)"[menu/General script]
views.get("blog").vw.setTop((int)((1d / 100 * height)));
views.get("blog").vw.setHeight((int)((9d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 15;BA.debugLine="btn_list.SetLeftAndRight(20%x,80%x)"[menu/General script]
views.get("btn_list").vw.setLeft((int)((20d / 100 * width)));
views.get("btn_list").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 16;BA.debugLine="btn_list.SetTopAndBottom(12%y,22%y)"[menu/General script]
views.get("btn_list").vw.setTop((int)((12d / 100 * height)));
views.get("btn_list").vw.setHeight((int)((22d / 100 * height) - ((12d / 100 * height))));
//BA.debugLineNum = 18;BA.debugLine="btn_fave.SetLeftAndRight(20%x,80%x)"[menu/General script]
views.get("btn_fave").vw.setLeft((int)((20d / 100 * width)));
views.get("btn_fave").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 19;BA.debugLine="btn_fave.SetTopAndBottom(26%y,36%y)"[menu/General script]
views.get("btn_fave").vw.setTop((int)((26d / 100 * height)));
views.get("btn_fave").vw.setHeight((int)((36d / 100 * height) - ((26d / 100 * height))));
//BA.debugLineNum = 21;BA.debugLine="btn_search.SetLeftAndRight(20%x,80%x)"[menu/General script]
views.get("btn_search").vw.setLeft((int)((20d / 100 * width)));
views.get("btn_search").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 22;BA.debugLine="btn_search.SetTopAndBottom(40%y,50%y)"[menu/General script]
views.get("btn_search").vw.setTop((int)((40d / 100 * height)));
views.get("btn_search").vw.setHeight((int)((50d / 100 * height) - ((40d / 100 * height))));
//BA.debugLineNum = 24;BA.debugLine="btn_about.SetLeftAndRight(20%x,80%x)"[menu/General script]
views.get("btn_about").vw.setLeft((int)((20d / 100 * width)));
views.get("btn_about").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 25;BA.debugLine="btn_about.SetTopAndBottom(54%y,64%y)"[menu/General script]
views.get("btn_about").vw.setTop((int)((54d / 100 * height)));
views.get("btn_about").vw.setHeight((int)((64d / 100 * height) - ((54d / 100 * height))));
//BA.debugLineNum = 27;BA.debugLine="btn_close.SetLeftAndRight(20%x,80%x)"[menu/General script]
views.get("btn_close").vw.setLeft((int)((20d / 100 * width)));
views.get("btn_close").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
//BA.debugLineNum = 28;BA.debugLine="btn_close.SetTopAndBottom(68%y,78%y)"[menu/General script]
views.get("btn_close").vw.setTop((int)((68d / 100 * height)));
views.get("btn_close").vw.setHeight((int)((78d / 100 * height) - ((68d / 100 * height))));
//BA.debugLineNum = 30;BA.debugLine="Seyed.SetLeftAndRight(40%x,60%x)"[menu/General script]
views.get("seyed").vw.setLeft((int)((40d / 100 * width)));
views.get("seyed").vw.setWidth((int)((60d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 31;BA.debugLine="Seyed.SetTopAndBottom(83%y,96%y)"[menu/General script]
views.get("seyed").vw.setTop((int)((83d / 100 * height)));
views.get("seyed").vw.setHeight((int)((96d / 100 * height) - ((83d / 100 * height))));

}
}