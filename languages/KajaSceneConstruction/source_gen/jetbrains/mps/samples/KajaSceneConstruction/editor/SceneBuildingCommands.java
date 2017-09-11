package jetbrains.mps.samples.KajaSceneConstruction.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.transformation.TransformationMenuBase;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.editor.menus.transformation.MenuLocations;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuItem;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuContext;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.MenuPart;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.editor.menus.transformation.SubMenuMenuTransformationMenuPart;
import java.util.Arrays;
import jetbrains.mps.lang.editor.menus.SingleItemMenuPart;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.menus.transformation.ActionItemBase;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class SceneBuildingCommands extends TransformationMenuBase {
  public SceneBuildingCommands() {
    super(true);
  }
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.CONTEXT_ASSISTANT);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @NotNull
  @Override
  public List<TransformationMenuItem> createMenuItems(@NotNull TransformationMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("contribution to the " + "default transformation menu for " + "EmptyLine", new SNodePointer("r:c23c1e07-b721-429a-b911-f2771cc8a585(jetbrains.mps.samples.KajaSceneConstruction.editor)", "542153281319938106")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }

  @Override
  @NotNull
  protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts(TransformationMenuContext _context) {
    List<MenuPart<TransformationMenuItem, TransformationMenuContext>> result = new ArrayList<MenuPart<TransformationMenuItem, TransformationMenuContext>>();
    if (ListSequence.fromListAndArray(new ArrayList<String>(), MenuLocations.CONTEXT_ASSISTANT).contains(_context.getMenuLocation())) {
      result.add(new SceneBuildingCommands.TMP_SubMenu_572eic_a0());
    }
    return result;
  }

  public class TMP_SubMenu_572eic_a0 extends SubMenuMenuTransformationMenuPart {
    @Override
    protected String getText(TransformationMenuContext _context) {
      return "Scene builder";
    }

    @NotNull
    @Override
    public TransformationMenuItem createItem(@NotNull TransformationMenuContext context) {
      context.getEditorMenuTrace().pushTraceInfo();
      context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("submenu " + getText(context), new SNodePointer("r:c23c1e07-b721-429a-b911-f2771cc8a585(jetbrains.mps.samples.KajaSceneConstruction.editor)", "542153281320361713")));
      try {
        return super.createItem(context);
      } finally {
        context.getEditorMenuTrace().popTraceInfo();
      }
    }


    @Override
    protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts() {
      return Arrays.<MenuPart<TransformationMenuItem, TransformationMenuContext>>asList(new SceneBuildingCommands.TMP_SubMenu_572eic_a0.TMP_Action_572eic_a0a(), new SceneBuildingCommands.TMP_SubMenu_572eic_a0.TMP_Action_572eic_b0a(), new SceneBuildingCommands.TMP_SubMenu_572eic_a0.TMP_Action_572eic_c0a(), new SceneBuildingCommands.TMP_SubMenu_572eic_a0.TMP_Action_572eic_d0a());
    }
    private class TMP_Action_572eic_a0a extends SingleItemMenuPart<TransformationMenuItem, TransformationMenuContext> {
      @Nullable
      protected TransformationMenuItem createItem(TransformationMenuContext context) {
        return new SceneBuildingCommands.TMP_SubMenu_572eic_a0.TMP_Action_572eic_a0a.Item(context);
      }

      private class Item extends ActionItemBase {
        private final TransformationMenuContext _context;
        private final EditorMenuTraceInfo myEditorMenuTraceInfo;
        private Item(TransformationMenuContext context) {
          _context = context;
          _context.getEditorMenuTrace().pushTraceInfo();
          _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("single item: " + getLabelText(""), new SNodePointer("r:c23c1e07-b721-429a-b911-f2771cc8a585(jetbrains.mps.samples.KajaSceneConstruction.editor)", "542153281319938188")));
          myEditorMenuTraceInfo = _context.getEditorMenuTrace().getTraceInfo();
          context.getEditorMenuTrace().popTraceInfo();
        }

        @Nullable
        @Override
        public String getLabelText(String pattern) {
          return "Build wall";
        }

        @Override
        public void execute(@NotNull String pattern) {
          SNode inserted = SNodeOperations.insertPrevSiblingChild(_context.getNode(), SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a8341e10L, "jetbrains.mps.samples.KajaSceneConstruction.structure.BuildWall")), null));
          _context.getEditorContext().selectWRTFocusPolicy(inserted);
        }




        @Override
        public EditorMenuTraceInfo getTraceInfo() {
          return myEditorMenuTraceInfo;
        }
      }

    }
    private class TMP_Action_572eic_b0a extends SingleItemMenuPart<TransformationMenuItem, TransformationMenuContext> {
      @Nullable
      protected TransformationMenuItem createItem(TransformationMenuContext context) {
        return new SceneBuildingCommands.TMP_SubMenu_572eic_a0.TMP_Action_572eic_b0a.Item(context);
      }

      private class Item extends ActionItemBase {
        private final TransformationMenuContext _context;
        private final EditorMenuTraceInfo myEditorMenuTraceInfo;
        private Item(TransformationMenuContext context) {
          _context = context;
          _context.getEditorMenuTrace().pushTraceInfo();
          _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("single item: " + getLabelText(""), new SNodePointer("r:c23c1e07-b721-429a-b911-f2771cc8a585(jetbrains.mps.samples.KajaSceneConstruction.editor)", "542153281319938756")));
          myEditorMenuTraceInfo = _context.getEditorMenuTrace().getTraceInfo();
          context.getEditorMenuTrace().popTraceInfo();
        }

        @Nullable
        @Override
        public String getLabelText(String pattern) {
          return "Destroy wall";
        }

        @Override
        public void execute(@NotNull String pattern) {
          SNode inserted = SNodeOperations.insertPrevSiblingChild(_context.getNode(), SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fa55L, "jetbrains.mps.samples.KajaSceneConstruction.structure.DestroyWall")), null));
          _context.getEditorContext().selectWRTFocusPolicy(inserted);

        }




        @Override
        public EditorMenuTraceInfo getTraceInfo() {
          return myEditorMenuTraceInfo;
        }
      }

    }
    private class TMP_Action_572eic_c0a extends SingleItemMenuPart<TransformationMenuItem, TransformationMenuContext> {
      @Nullable
      protected TransformationMenuItem createItem(TransformationMenuContext context) {
        return new SceneBuildingCommands.TMP_SubMenu_572eic_a0.TMP_Action_572eic_c0a.Item(context);
      }

      private class Item extends ActionItemBase {
        private final TransformationMenuContext _context;
        private final EditorMenuTraceInfo myEditorMenuTraceInfo;
        private Item(TransformationMenuContext context) {
          _context = context;
          _context.getEditorMenuTrace().pushTraceInfo();
          _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("single item: " + getLabelText(""), new SNodePointer("r:c23c1e07-b721-429a-b911-f2771cc8a585(jetbrains.mps.samples.KajaSceneConstruction.editor)", "542153281319938913")));
          myEditorMenuTraceInfo = _context.getEditorMenuTrace().getTraceInfo();
          context.getEditorMenuTrace().popTraceInfo();
        }

        @Nullable
        @Override
        public String getLabelText(String pattern) {
          return "Drop mark";
        }

        @Override
        public void execute(@NotNull String pattern) {
          SNode inserted = SNodeOperations.insertPrevSiblingChild(_context.getNode(), SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fe3eL, "jetbrains.mps.samples.KajaSceneConstruction.structure.DropMark")), null));
          _context.getEditorContext().selectWRTFocusPolicy(inserted);
        }




        @Override
        public EditorMenuTraceInfo getTraceInfo() {
          return myEditorMenuTraceInfo;
        }
      }

    }
    private class TMP_Action_572eic_d0a extends SingleItemMenuPart<TransformationMenuItem, TransformationMenuContext> {
      @Nullable
      protected TransformationMenuItem createItem(TransformationMenuContext context) {
        return new SceneBuildingCommands.TMP_SubMenu_572eic_a0.TMP_Action_572eic_d0a.Item(context);
      }

      private class Item extends ActionItemBase {
        private final TransformationMenuContext _context;
        private final EditorMenuTraceInfo myEditorMenuTraceInfo;
        private Item(TransformationMenuContext context) {
          _context = context;
          _context.getEditorMenuTrace().pushTraceInfo();
          _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("single item: " + getLabelText(""), new SNodePointer("r:c23c1e07-b721-429a-b911-f2771cc8a585(jetbrains.mps.samples.KajaSceneConstruction.editor)", "542153281319938972")));
          myEditorMenuTraceInfo = _context.getEditorMenuTrace().getTraceInfo();
          context.getEditorMenuTrace().popTraceInfo();
        }

        @Nullable
        @Override
        public String getLabelText(String pattern) {
          return "Pick mark";
        }

        @Override
        public void execute(@NotNull String pattern) {
          SNode inserted = SNodeOperations.insertPrevSiblingChild(_context.getNode(), SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a835165fL, "jetbrains.mps.samples.KajaSceneConstruction.structure.PickMark")), null));
          _context.getEditorContext().selectWRTFocusPolicy(inserted);
        }




        @Override
        public EditorMenuTraceInfo getTraceInfo() {
          return myEditorMenuTraceInfo;
        }
      }

    }
  }
}
