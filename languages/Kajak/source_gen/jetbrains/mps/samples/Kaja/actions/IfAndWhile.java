package jetbrains.mps.samples.Kaja.actions;

/*Generated by MPS */

import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class IfAndWhile {
  public static class NodeFactory_7721946591176420157 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      {
        final SNode whileCmd = sampleNode;
        if (SNodeOperations.isInstanceOf(whileCmd, MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecece0L, "jetbrains.mps.samples.Kaja.structure.While"))) {
          SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ec9fbeL, 0x2de971c785ec9fc0L, "condition"), SLinkOperations.getTarget(whileCmd, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecece0L, 0x2de971c785ecece2L, "condition")));
          SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ec9fbeL, 0x2de971c785ec9fc4L, "trueBranch"), SLinkOperations.getTarget(whileCmd, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecece0L, 0x2de971c785ecece3L, "body")));
        }
      }
    }
  }
  public static class NodeFactory_7721946591176515850 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      {
        final SNode ifCmd = sampleNode;
        if (SNodeOperations.isInstanceOf(ifCmd, MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ec9fbeL, "jetbrains.mps.samples.Kaja.structure.IfStatement"))) {
          SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecece0L, 0x2de971c785ecece2L, "condition"), SLinkOperations.getTarget(ifCmd, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ec9fbeL, 0x2de971c785ec9fc0L, "condition")));
          SLinkOperations.setTarget(newNode, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecece0L, 0x2de971c785ecece3L, "body"), SLinkOperations.getTarget(ifCmd, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ec9fbeL, 0x2de971c785ec9fc4L, "trueBranch")));
        }
      }
    }
  }
}
