package jetbrains.mps.samples.Kaja.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.openapi.intentions.IntentionExecutable;
import jetbrains.mps.openapi.intentions.Kind;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import java.util.Collections;
import jetbrains.mps.intentions.AbstractIntentionExecutable;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;

public final class ExtractRoutine_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public ExtractRoutine_Intention() {
    super(Kind.NORMAL, true, new SNodePointer("r:c23df2a3-084e-497b-b2a5-1671f4fbf9de(jetbrains.mps.samples.Kaja.intentions)", "7446293342517485574"));
  }
  @Override
  public String getPresentation() {
    return "ExtractRoutine";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }
  @Override
  public boolean isSurroundWith() {
    return true;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new ExtractRoutine_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Extract Routine";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      SNode routineDefinition = SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed6f79L, "jetbrains.mps.samples.Kaja.structure.RoutineDefinition")), null);
      List<SNode> selectedNodes = editorContext.getSelectedNodes();
      ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc45746L, "jetbrains.mps.samples.Kaja.structure.Script"), true, false), MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc45746L, 0x2d523c5e4cc4574cL, "body")), MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785f06a3fL, 0x2de971c785f06a40L, "commands"))).addElement(routineDefinition);
      SNode call = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed6f92L, "jetbrains.mps.samples.Kaja.structure.RoutineCall"));
      SLinkOperations.setTarget(call, MetaAdapterFactory.getReferenceLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed6f92L, 0x2de971c785ede3ccL, "definition"), routineDefinition);
      SNodeOperations.insertPrevSiblingChild(ListSequence.fromList(selectedNodes).first(), call);
      for (SNode selectedNode : ListSequence.fromList(selectedNodes)) {
        ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(routineDefinition, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed6f79L, 0x2de971c785ed6f7cL, "body")), MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785f06a3fL, 0x2de971c785f06a40L, "commands"))).addElement(SNodeOperations.getNodeAncestor(selectedNode, MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc4574aL, "jetbrains.mps.samples.Kaja.structure.AbstractCommand"), true, false));
      }
      editorContext.selectWRTFocusPolicy(routineDefinition);
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return ExtractRoutine_Intention.this;
    }
  }
}
