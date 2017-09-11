package jetbrains.mps.samples.Kaja.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.runtime.MapConfigBase;
import jetbrains.mps.generator.runtime.TemplateMappingConfiguration;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateReductionRule;
import jetbrains.mps.generator.runtime.TemplateRootMappingRule;
import jetbrains.mps.generator.runtime.TemplateDropRootRule;
import jetbrains.mps.generator.runtime.TemplateMappingScript;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.ReductionRuleBase;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.generator.runtime.MapRootRuleBase;
import jetbrains.mps.generator.runtime.DropRootRuleBase;

@Generated
public class Mapping_main extends MapConfigBase implements TemplateMappingConfiguration {
  private final Collection<TemplateReductionRule> rules;
  private final Collection<TemplateRootMappingRule> rootRules;
  private final Collection<TemplateDropRootRule> dropRules;
  private final Collection<TemplateMappingScript> preScripts;
  public Mapping_main(@NotNull TemplateModel model) {
    super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039570163"), "main", model, false);
    rules = TemplateUtil.<TemplateReductionRule>asCollection(new Mapping_main.ReductionRule0(), new Mapping_main.ReductionRule1(), new Mapping_main.ReductionRule2(), new Mapping_main.ReductionRule3(), new Mapping_main.ReductionRule4(), new Mapping_main.ReductionRule5(), new Mapping_main.ReductionRule6(), new Mapping_main.ReductionRule7(), new Mapping_main.ReductionRule8(), new Mapping_main.ReductionRule9(), new Mapping_main.ReductionRule10(), new Mapping_main.ReductionRule11(), new Mapping_main.ReductionRule12(), new Mapping_main.ReductionRule13(), new Mapping_main.ReductionRule14(), new Mapping_main.ReductionRule15(), new Mapping_main.ReductionRule16(), new Mapping_main.ReductionRule17(), new Mapping_main.ReductionRule18(), new Mapping_main.ReductionRule19(), new Mapping_main.ReductionRule20());
    rootRules = TemplateUtil.<TemplateRootMappingRule>asCollection(new Mapping_main.RootMappingRule0());
    dropRules = TemplateUtil.<TemplateDropRootRule>asCollection(new Mapping_main.DropRootRule0());
    preScripts = TemplateUtil.<TemplateMappingScript>asCollection(new Script_MoveRoutineDefinitions(), new Script_MoveLibraryRoutineDefinitions(), new Script_RemoveEmptyLines());
  }
  @Override
  public Collection<TemplateReductionRule> getReductionRules() {
    return rules;
  }
  @Override
  public Collection<TemplateRootMappingRule> getRootRules() {
    return rootRules;
  }
  @Override
  public Collection<TemplateDropRootRule> getDropRules() {
    return dropRules;
  }
  @Override
  public Collection<TemplateMappingScript> getPreScripts() {
    return preScripts;
  }
  public final class ReductionRule0 extends ReductionRuleBase {
    public ReductionRule0() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039580714"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc45762L, "jetbrains.mps.samples.Kaja.structure.Step"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_Step().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule1 extends ReductionRuleBase {
    public ReductionRule1() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039647643"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ec9f8bL, "jetbrains.mps.samples.Kaja.structure.LeftTurn"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_LeftTurn().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule2 extends ReductionRuleBase {
    public ReductionRule2() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039647796"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785eca02cL, "jetbrains.mps.samples.Kaja.structure.IsWall"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_IsWall().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule3 extends ReductionRuleBase {
    public ReductionRule3() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039654077"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecb8b0L, "jetbrains.mps.samples.Kaja.structure.Not"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_Not().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule4 extends ReductionRuleBase {
    public ReductionRule4() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039647830"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ec9fbeL, "jetbrains.mps.samples.Kaja.structure.IfStatement"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_IfStatement().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule5 extends ReductionRuleBase {
    public ReductionRule5() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039660390"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecd14cL, "jetbrains.mps.samples.Kaja.structure.Repeat"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_Repeat().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule6 extends ReductionRuleBase {
    public ReductionRule6() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039667448"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecece0L, "jetbrains.mps.samples.Kaja.structure.While"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_While().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule7 extends ReductionRuleBase {
    public ReductionRule7() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039683662"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed2c41L, "jetbrains.mps.samples.Kaja.structure.Heading"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_Heading().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule8 extends ReductionRuleBase {
    public ReductionRule8() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "7060824959893176543"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x61fd16e423a38042L, "jetbrains.mps.samples.Kaja.structure.Looking"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_Looking().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule9 extends ReductionRuleBase {
    public ReductionRule9() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039683776"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed0d3bL, "jetbrains.mps.samples.Kaja.structure.North"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_North().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule10 extends ReductionRuleBase {
    public ReductionRule10() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "6504511466431754824"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed0d41L, "jetbrains.mps.samples.Kaja.structure.East"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_East().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule11 extends ReductionRuleBase {
    public ReductionRule11() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039683806"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed0d4bL, "jetbrains.mps.samples.Kaja.structure.South"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_South().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule12 extends ReductionRuleBase {
    public ReductionRule12() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039683821"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed2c3cL, "jetbrains.mps.samples.Kaja.structure.West"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_West().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule13 extends ReductionRuleBase {
    public ReductionRule13() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039701201"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed6f79L, "jetbrains.mps.samples.Kaja.structure.RoutineDefinition"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_RoutineDefinition().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule14 extends ReductionRuleBase {
    public ReductionRule14() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039701251"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed6f92L, "jetbrains.mps.samples.Kaja.structure.RoutineCall"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_RoutineCall().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule15 extends ReductionRuleBase {
    public ReductionRule15() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039928807"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785f06a3fL, "jetbrains.mps.samples.Kaja.structure.CommandList"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_CommandList().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule16 extends ReductionRuleBase {
    public ReductionRule16() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "6405700485436123137"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x58e59ea713f79f27L, "jetbrains.mps.samples.Kaja.structure.Drop"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_Drop().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule17 extends ReductionRuleBase {
    public ReductionRule17() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "6405700485436170018"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x58e59ea713f85f1dL, "jetbrains.mps.samples.Kaja.structure.Pick"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_Pick().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule18 extends ReductionRuleBase {
    public ReductionRule18() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "6405700485436287827"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x58e59ea713fa2b43L, "jetbrains.mps.samples.Kaja.structure.CommentLine"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_CommentLine().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule19 extends ReductionRuleBase {
    public ReductionRule19() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3210697320273763069"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2c8eb033a8375aeeL, "jetbrains.mps.samples.Kaja.structure.TraceMessage"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_TraceMessage().apply(environment, context);
      return tlist1;
    }
  }
  public final class ReductionRule20 extends ReductionRuleBase {
    public ReductionRule20() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "6504511466431755001"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x5a44aab7621181efL, "jetbrains.mps.samples.Kaja.structure.NoDirection"), false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> tlist1 = new Template_reduce_NoDirection().apply(environment, context);
      return tlist1;
    }
  }
  public class RootMappingRule0 extends MapRootRuleBase implements TemplateRootMappingRule {
    public RootMappingRule0() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039570164"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc45746L, "jetbrains.mps.samples.Kaja.structure.Script"), false, false);
    }
    @Override
    public Collection<SNode> apply(@NotNull final TemplateContext context) throws GenerationException {
      final TemplateExecutionEnvironment environment = context.getEnvironment();
      Collection<SNode> result = new Template_map_Script().apply(environment, context);
      return result;
    }
  }
  public class DropRootRule0 extends DropRootRuleBase implements TemplateDropRootRule {
    public DropRootRule0() {
      super(new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "4394627182934963716"), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x3cfcda239f19d316L, "jetbrains.mps.samples.Kaja.structure.Library"));
    }
  }
}
