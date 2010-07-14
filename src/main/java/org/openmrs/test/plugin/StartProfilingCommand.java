package org.openmrs.test.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * @goal start-profiling
 */
public class StartProfilingCommand extends AbstractMojo
{
    public void execute() throws MojoExecutionException
    {
        getLog().info("java -jar /home/yhemanth/software/yourkit/yjp-9.0.5/lib/yjp-controller-api-redist.jarjar 10.4.3.223 10001 start-cpu-sampling");
    }
}
