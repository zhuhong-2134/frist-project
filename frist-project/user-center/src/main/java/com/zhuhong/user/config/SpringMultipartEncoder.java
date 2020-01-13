//package com.zhuhong.user.config;
//
//import feign.RequestTemplate;
//import feign.codec.EncodeException;
//import feign.codec.Encoder;
//import feign.form.ContentType;
//import feign.form.FormEncoder;
//import feign.form.MultipartFormContentProcessor;
//import feign.form.spring.SpringManyMultipartFilesWriter;
//import feign.form.spring.SpringSingleMultipartFileWriter;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.lang.reflect.Type;
//import java.util.Collections;
//import java.util.Map;
//
///**
// * <p>
// * Description: [配置服务于服务之间的文件传输]
// * </p>
// * Created on 2019-09-24
// *
// * @author <a href="mailto: zhuhong45@camelotchina.com">朱鸿</a>
// * @version 1.0 Copyright (c) 2019 北京柯莱特科技有限公司
// */
//public class SpringMultipartEncoder extends FormEncoder {
//
//    /**
//     * Constructor with the default Feign's encoder as a delegate.
//     */
//    public SpringMultipartEncoder() {
//        this(new Encoder.Default());
//    }
//
//    /**
//     * Constructor with specified delegate encoder.
//     *
//     * @param delegate delegate encoder, if this encoder couldn't encode object.
//     */
//    public SpringMultipartEncoder(Encoder delegate) {
//        super(delegate);
//
//        MultipartFormContentProcessor processor = (MultipartFormContentProcessor) getContentProcessor(ContentType.MULTIPART);
//        processor.addWriter(new SpringSingleMultipartFileWriter());
//        processor.addWriter(new SpringManyMultipartFilesWriter());
//    }
//
//    @Override
//    public void encode(Object object, Type bodyType, RequestTemplate template) throws EncodeException {
//        // 单MultipartFile判断
//        if (bodyType.equals(MultipartFile.class)) {
//            MultipartFile file = (MultipartFile) object;
//            @SuppressWarnings("rawtypes")
//            Map data = Collections.singletonMap(file.getName(), object);
//            super.encode(data, MAP_STRING_WILDCARD, template);
//            return;
//        } else if (bodyType.equals(MultipartFile[].class)) {
//            // MultipartFile数组处理
//            MultipartFile[] file = (MultipartFile[]) object;
//            if (file != null) {
//                Map<String, Object> data = Collections.singletonMap(file.length == 0 ? "" : file[0].getName(), object);
//                super.encode(data, MAP_STRING_WILDCARD, template);
//                return;
//            }
//        }
//        // 其他类型调用父类默认处理方法
//        super.encode(object, bodyType, template);
//    }
//
//}
