﻿/* @csharp.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

namespace GridGain.Client.Impl.Portable
{
    /**
     * <summary>Output for portable marshaller.</summary>
     */ 
    interface IGridClientPortableMarshallerOutput
    {
        /**
         * <summary>Initialize output.</summary>
         * <param name="len">Resulting data length.</param>
         */ 
        void Initialize(int len);

        /**
         * <summary>Write single byte.</summary>
         * <param name="val">Byte</param>
         */
        void WriteByte(byte val);

        /**
         * <summary>Write byte array.</summary>
         * <param name="val">Byte array.</param>
         */
        void WriteBytes(byte[] val);

        /**
         * <summary>Flushes output to the underlying storage and closes the output.</summary>
         */ 
        void Close();
    }
}