package jetbrains.mps.samples.Kaja.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.lang.structure.editor.structure_StyleSheet.KeywordStyleClass;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.ClassNameStyleClass;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.KeyWordStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;

/*package*/ class Script_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Script_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_udqu28_a();
  }

  private EditorCell createCollection_udqu28_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_udqu28_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    editorCell.addEditorCell(createConstant_udqu28_a0());
    editorCell.addEditorCell(createProperty_udqu28_b0());
    editorCell.addEditorCell(createAlternation_udqu28_c0());
    editorCell.addEditorCell(createRefNode_udqu28_d0());
    editorCell.addEditorCell(createConstant_udqu28_e0());
    return editorCell;
  }
  private EditorCell createConstant_udqu28_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Script");
    editorCell.setCellId("Constant_udqu28_a0");
    Style style = new StyleImpl();
    new KeywordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_udqu28_b0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_name");
    Style style = new StyleImpl();
    new ClassNameStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private EditorCell createAlternation_udqu28_c0() {
    boolean alternationCondition = true;
    alternationCondition = nodeCondition_udqu28_a2a();
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = createConstant_udqu28_a2a();
    } else {
      editorCell = createConstant_udqu28_a2a_0();
    }
    return editorCell;
  }
  private boolean nodeCondition_udqu28_a2a() {
    return ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(myNode, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc45746L, 0x2d523c5e4cc4574cL, "body")), MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785f06a3fL, 0x2de971c785f06a40L, "commands"))).isNotEmpty();
  }
  private EditorCell createConstant_udqu28_a2a() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "runs as");
    editorCell.setCellId("Constant_udqu28_a2a");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.MATCHING_LABEL, "script_block");
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_udqu28_a2a_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "runs as");
    editorCell.setCellId("Constant_udqu28_a2a_0");
    Style style = new StyleImpl();
    new KeyWordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.MATCHING_LABEL, "script_block");
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_udqu28_d0() {
    SingleRoleCellProvider provider = new Script_EditorBuilder_a.bodySingleRoleHandler_udqu28_d0(myNode, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc45746L, 0x2d523c5e4cc4574cL, "body"), getEditorContext());
    return provider.createCell();
  }
  private static class bodySingleRoleHandler_udqu28_d0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public bodySingleRoleHandler_udqu28_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc45746L, 0x2d523c5e4cc4574cL, "body"), child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc45746L, 0x2d523c5e4cc4574cL, "body"), child));
      installCellInfo(child, editorCell);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new SChildSubstituteInfo(editorCell, myNode, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc45746L, 0x2d523c5e4cc4574cL, "body"), child));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("body");
      }
      Style style = new StyleImpl();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc45746L, 0x2d523c5e4cc4574cL, "body")));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_body");
        installCellInfo(null, editorCell);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no body>";
    }
  }
  private EditorCell createConstant_udqu28_e0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "end");
    editorCell.setCellId("Constant_udqu28_e0");
    Style style = new StyleImpl();
    new KeywordStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    style.set(StyleAttributes.MATCHING_LABEL, "script_block");
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
