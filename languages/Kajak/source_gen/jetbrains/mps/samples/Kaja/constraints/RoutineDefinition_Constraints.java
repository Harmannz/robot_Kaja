package jetbrains.mps.samples.Kaja.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.runtime.ConstraintFunction;
import jetbrains.mps.smodel.runtime.ConstraintContext_CanBeChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;

public class RoutineDefinition_Constraints extends BaseConstraintsDescriptor {
  public RoutineDefinition_Constraints() {
    super(MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed6f79L, "jetbrains.mps.samples.Kaja.structure.RoutineDefinition"));
  }

  @Override
  protected ConstraintFunction<ConstraintContext_CanBeChild, Boolean> calculateCanBeChildConstraint() {
    return new ConstraintFunction<ConstraintContext_CanBeChild, Boolean>() {
      @NotNull
      public Boolean invoke(@NotNull ConstraintContext_CanBeChild context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = staticCanBeAChild(context.getNode(), context.getParentNode(), context.getConcept(), context.getLink());

        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
        }

        return result;
      }
    };
  }
  private static boolean staticCanBeAChild(SNode node, SNode parentNode, SAbstractConcept childConcept, SContainmentLink link) {
    return (SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785f06a3fL, "jetbrains.mps.samples.Kaja.structure.CommandList")) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(parentNode), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc45746L, "jetbrains.mps.samples.Kaja.structure.Script"))) || SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x3cfcda239f19d316L, "jetbrains.mps.samples.Kaja.structure.Library"));
  }
  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:6c66d6ce-c8f4-4daf-92c4-a518b78006a8(jetbrains.mps.samples.Kaja.constraints)", "1227128029536582766");
}
