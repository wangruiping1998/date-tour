//package cn.wangruiping.tour.user;
//
//import cn.wangruiping.tour.db.entity.UserEntity;
//import org.jspecify.annotations.Nullable;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//
///**
// *
// * @author wrp
// * @since 2026年03月12日 10:03
// **/
//public class MyUserDetails implements UserDetails {
//
//    private final UserEntity user;
//
//    public MyUserDetails(UserEntity user) {
//        this.user = user;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return List.of();
//    }
//
//    @Override
//    public @Nullable String getPassword() {
//        return user.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return user.getUsername();
//    }
//}
