package ir.seyed.blog.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_text{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panel1").vw.setTop((int)((0d / 100 * height)));
views.get("panel1").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("label1").vw.setLeft((int)((20d / 100 * width)));
views.get("label1").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
views.get("label1").vw.setTop((int)((1d / 100 * height)));
views.get("label1").vw.setHeight((int)((9d / 100 * height) - ((1d / 100 * height))));
views.get("scrollview1").vw.setLeft((int)((0d / 100 * width)));
views.get("scrollview1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("scrollview1").vw.setTop((int)((10d / 100 * height)));
views.get("scrollview1").vw.setHeight((int)((90d / 100 * height) - ((10d / 100 * height))));
views.get("btn_share").vw.setLeft((int)((1d / 100 * width)));
views.get("btn_share").vw.setWidth((int)((15d / 100 * width) - ((1d / 100 * width))));
views.get("btn_share").vw.setTop((int)((90.5d / 100 * height)));
views.get("btn_share").vw.setHeight((int)((99.5d / 100 * height) - ((90.5d / 100 * height))));

}
}