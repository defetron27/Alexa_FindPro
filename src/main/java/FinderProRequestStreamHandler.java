import Handlers.*;
import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class FinderProRequestStreamHandler extends SkillStreamHandler
{
    private static Skill getSkill()
    {
        return Skills.standard()
                .addRequestHandlers(
                        new LaunchIntentRequestHandler(),
                        new ShowTheTaskMenuIntentRequestHandler(),
                        new TaskNameIntentRequestHandler(),
                        new GetBucketNameIntentRequestHandler(),
                        new ThisIsMyBucketNameIntentRequestHandler(),
                        new GetFileNameIntentRequestHandler(),
                        new ThisIsMyFileNameIntentRequestHandler(),
                        new GetFileFormatIntentRequestHandler(),
                        new SearchTextIntentRequestHandler(),
                        new SearchObjectIntentRequestHandler(),
                        new GetTargetBucketNameIntentRequestHandler(),
                        new GetTargetFileNameIntentRequestHandler(),
                        new GetTargetFileFormatIntentRequestHandler()
                )
                .withSkillId("amzn1.ask.skill.fa49a430-8aab-4080-aaac-8179aac70d40")
                .build();
    }

    public FinderProRequestStreamHandler() {
        super(getSkill());
    }
}
