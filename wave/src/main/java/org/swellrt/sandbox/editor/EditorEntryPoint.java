package org.swellrt.sandbox.editor;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class EditorEntryPoint implements EntryPoint {

  public void onModuleLoad() {

    VerticalPanel basePanel = new VerticalPanel();
    basePanel.setWidth("100%");

    HTML titleHtml = new HTML("<div> Editor Sandox </div>");
    basePanel.add(titleHtml);

    EditorComponent editorComponent = new EditorComponent();
    editorComponent.init();

    basePanel.add(editorComponent);
    RootPanel.get().add(basePanel);

    editorComponent.getEditor().focus(true);
  }


}
