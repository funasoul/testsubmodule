package jp.ac.keio.bio.fun.wrapper;

import jp.ac.keio.bio.fun.xitosbml.cli.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        new CliMainImgSpatial().runCli("foo", "bar");
        System.out.println( "Hello World!" );
    }
}
